package tttttt2test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OptionSpecification {
	private Method method;
	private boolean activated = false;
	private Switch _switch;
	private ParameterConsumption parameterConsumption;
	private boolean required;
	private Occurrences occurrences;
	private Object spec;
	private ArrayList<Object> parameterBuffer = new ArrayList<Object>();

	public OptionSpecification(Object spec, Method method, Switch _switch, ParameterConsumption parameterConsumption,
			boolean required, Occurrences occurences) {
		this.spec = spec;
		this._switch = _switch;
		this.method = method;
		this.parameterConsumption = parameterConsumption;
		this.required = required;
		this.occurrences = occurences;
		validate();
	}

	public boolean isLooseParametersSpecification() {
		return parameterConsumption.getType() == ParameterConsumptionType.LOOSE_ARGS;
	}

	public void validate() {
		if (parameterConsumption.getType() != ParameterConsumptionType.LOOSE_ARGS) {
			if (_switch == null || (_switch.getShortSwitch() == null && _switch.getLongSwitch() == null)) {
				throw createInvalidOptionSpecificationException("Option specified without switchess");
			}
		}
		validateType();
	}

	private void validateType() {
		Type[] types = method.getGenericParameterTypes();
		if (types == null || types.length != 1) {
			throw createInvalidOptionSpecificationException("Wrong number of parameters, expecting exactly one");
		}
		Type type = types[0];
		int listLevel = getListLevel();
	}


	private Class toClass(Type type) {
		if (type instanceof ParameterizedType) {
			return (Class) ((ParameterizedType) type).getRawType();
		} else if (type instanceof Class) {
			return (Class) type;
		} else {
			throw createInternalErrorException("Don't know how to get the class from type " + type);
		}
	}

	@SuppressWarnings("unchecked")
	private Class<?> box(Class<?> rawClass) {
		if (rawClass == boolean.class) {
			return Boolean.class;
		} else {
			return rawClass;
		}
	}

	private void wrongType(Type type) {
		throw createInvalidOptionSpecificationException(
				"Wrong parameter type, expected " + getExpectedTypeDescription() + " but found " + type);
	}

	private String getExpectedTypeDescription() {
		StringBuilder sb = new StringBuilder();
		int listLevel = getListLevel();
		for (int i = 0; i < listLevel; i++) {
			sb.append("List<");
		}
		sb.append(getInnerParameterType());
		for (int i = 0; i < listLevel; i++) {
			sb.append(">");
		}
		return sb.toString();
	}

	private int getListLevel() {
		int listLevel = 0;
		if (occurrences == Occurrences.MULTIPLE) {
			listLevel++;
		}
		switch (parameterConsumption.getType()) {
		case NO_ARGS:
		case SINGLE_ARGUMENT:
		case SUB_SET:
			break;
		case ALL_AVAILABLE:
		case UNTIL_DELIMITER:
			listLevel++;
			break;
		}
		return listLevel;
	}

	private Class<?> getInnerParameterType() {
		switch (parameterConsumption.getType()) {
		case NO_ARGS:
			return Boolean.class;
		case SINGLE_ARGUMENT:
			return String.class;
		case SUB_SET:
			return parameterConsumption.getSubsetClass();
		case ALL_AVAILABLE:
			return String.class;
		case UNTIL_DELIMITER:
			return String.class;
		case LOOSE_ARGS:
			return String.class;
		default:
			throw new RuntimeException("Internal error");
		}
	}

	public Switch getSwitch() {
		return _switch;
	}

	public void activateAndConsumeParameters(Tokenizer args)
			throws InvocationTargetException, IllegalAccessException, InstantiationException {
		activated = true;
		switch (parameterConsumption.getType()) {
		case NO_ARGS:
			handleParameters(parameterConsumption.getToggleValue());
			break;
		case SINGLE_ARGUMENT:
			if (!args.hasNext() || args.peek() instanceof SwitchToken) {
				throw createInvalidCommandLineException("Missing parameter");
			}
			String parameter = args.next().getValue();
			handleParameters(parameter);
			break;
		case ALL_AVAILABLE:
			ArrayList<String> allParameters = new ArrayList<String>();
			while (args.hasNext() && !(args.peek() instanceof SwitchToken)) {
				allParameters.add(args.next().getValue());
			}
			handleParameters(allParameters);
			break;
		case UNTIL_DELIMITER:
			args.setParameterTerminator(parameterConsumption.getDelimiter());
			ArrayList<String> delimitedParameters = new ArrayList<String>();
			while (args.hasNext() && !args.peek().getValue().equals(parameterConsumption.getDelimiter())) {
				delimitedParameters.add(args.next().getParameterValue());
			}
			if (args.hasNext())
				args.next();
			handleParameters(delimitedParameters);
			break;
		case SUB_SET:
			Object subset = parameterConsumption.getSubsetClass().newInstance();
			OptionSet subsetOptions = new OptionSet(subset, OptionSetLevel.SUB_GROUP);
			subsetOptions.consumeOptions(args);
			handleParameters(subset);
			break;
		case LOOSE_ARGS:
			handleParameters(args.next().getValue());
			break;
		default:
			throw createInternalErrorException("Not implemented: " + parameterConsumption.getType());
		}
	}

	private void handleParameters(Object args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		if (occurrences == Occurrences.SINGLE) {
			method.invoke(spec, args);
		} else {
			parameterBuffer.add(args);
		}
	}

	public void flush() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		if (required && !activated) {
			throw createInvalidCommandLineException("Required parameter not specified");
		}
		if (occurrences == Occurrences.MULTIPLE) {
			method.invoke(spec, parameterBuffer);
		}
	}

	private InvalidOptionConfigurationException createInvalidOptionSpecificationException(String description) {
		return new InvalidOptionConfigurationException(getOptionId() + ' ' + description);
	}

	private InvalidCommandLineException createInvalidCommandLineException(String description) {
		return new InvalidCommandLineException(getOptionId() + ' ' + description);
	}

	private RuntimeException createInternalErrorException(String description) {
		return new InternalErrorException(getOptionId() + ' ' + description);
	}

	public String getOptionId() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(spec.getClass().getName()).append(":").append(method.getName()).append("]");
		return sb.toString();
	}

}