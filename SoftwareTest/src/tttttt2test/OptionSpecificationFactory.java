package tttttt2test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class OptionSpecificationFactory {

	public static OptionSpecification getOptionSpecification(Object spec, Method method) {
		OptionSpecificationBuilder builder = new OptionSpecificationBuilder();
		builder.addMethod(method);
		builder.addConfiguration(spec);
		for (Annotation annotation : method.getAnnotations()) {
			if (annotation instanceof Option) {
			} else if (annotation instanceof LongSwitch) {
				builder.addLongSwitch(((LongSwitch) annotation).value());
			} else if (annotation instanceof ShortSwitch) {
				builder.addShortSwitch(((ShortSwitch) annotation).value());
			} else if (annotation instanceof Toggle) {
				builder.addToggle(((Toggle) annotation).value());
			} else if (annotation instanceof SingleParameter) {
				builder.addSingleParameter();
			} else if (annotation instanceof AllAvailableParameters) {
				builder.addAllAvailableParameters();
			} else if (annotation instanceof ParametersUntilDelimiter) {
				builder.addUntilDelimiter(((ParametersUntilDelimiter) annotation).value());
			} else if (annotation instanceof SubConfiguration) {
				builder.addSubset(((SubConfiguration) annotation).value());
			} else if (annotation instanceof Required) {
				builder.addRequired();
			} else if (annotation instanceof Multiple) {
				builder.addOccurrences(Occurrences.MULTIPLE);
			} else if (annotation instanceof LooseParameters) {
				builder.addLooseArgs();
			} else {
				System.out.println("Unhandled annotation: " + annotation);
			}
		}
		return builder.getOptionSpecification();

	}

	public static List<OptionSpecification> getOptionSpecifications(Object spec, Class<?> optionClass) {
		List<Method> methods = new Methods(optionClass).byAnnotation(Option.class);
		List<OptionSpecification> optionSpecifications = new ArrayList<OptionSpecification>();
		for (Method method : methods) {
			optionSpecifications.add(getOptionSpecification(spec, method));
		}
		return optionSpecifications;
	}
}
