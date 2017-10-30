package tttttt2test;

import java.lang.reflect.Method;

public class OptionSpecificationBuilder {

	private String longSwitch;
	private String shortSwitch;
	private ParameterConsumptionBuilder parameterConsumptionBuilder = new ParameterConsumptionBuilder();
	private Method method;
	private Occurrences occurrences = Occurrences.SINGLE;
	private boolean required = false;
	private Object spec;

	public void addMethod(Method method) {
		this.method = method;
	}

	public void addLongSwitch(String longSwitch) {
		this.longSwitch = longSwitch;
	}

	public void addShortSwitch(String shortSwitch) {
		this.shortSwitch = shortSwitch;
	}

	public void addToggle(boolean value) {
		parameterConsumptionBuilder.addNoArgs(value);
	}

	public void addSingleParameter() {
		parameterConsumptionBuilder.addSingleParameter();
	}

	public void addAllAvailableParameters() {
		parameterConsumptionBuilder.addAllAvailable();
	}

	public void addUntilDelimiter(String delimiter) {
		parameterConsumptionBuilder.addUntilDelimiter(delimiter);
	}

	public void addSubset(Class<?> optionClass) {
		parameterConsumptionBuilder.addSubSet(optionClass);
	}

	public void addLooseArgs() {
		parameterConsumptionBuilder.addLooseArgs();
	}

	public void addRequired() {
		required = true;
	}

	public void addOccurrences(Occurrences occurrences) {
		this.occurrences = occurrences;
	}

	public void addConfiguration(Object spec) {
		this.spec = spec;
	}

	public OptionSpecification getOptionSpecification() {
		Switch _switch = new Switch(longSwitch, shortSwitch);
		ParameterConsumption parameterConsumption = parameterConsumptionBuilder.getParameterConsumption();
		return new OptionSpecification(spec, method, _switch, parameterConsumption, required, occurrences);
	}

}
