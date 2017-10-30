package tttttt2test;

import java.lang.reflect.InvocationTargetException;


public class Command {

	/**
	 * A command line parser. It takes two parameters, a class and an parameter list,
	 * and returns an instance of the class, populated from the parameter list based
	 * on the annotations in the class. The class must have a no parameter constructor.
	 * @param <T> The type of the provided class
	 * @param optionClass A class that contains annotated setters that options/parameters will be assigned to
	 * @param args The provided parameter list, typically the parameter from the static main method
	 * @return An instance of the provided class, populated with the options and parameters of the parameter list
	 */
	public static <T> T parse(Class<T> optionClass, String[] args, OptionStyle style)
		throws IllegalAccessException, InstantiationException, InvocationTargetException
	{
		T spec = optionClass.newInstance();
		OptionSet optionSet = new OptionSet(spec, OptionSetLevel.MAIN_OPTIONS);
		Tokenizer tokenizer;
			if (style == OptionStyle.SIMPLE) {
				tokenizer = new SimpleTokenizer(new PeekIterator<String>(new ArrayIterator(args)));
			} else {
				tokenizer = new LongOrCompactTokenizer(new PeekIterator<String>(new ArrayIterator(args)));
			}
		optionSet.consumeOptions(tokenizer);
		return spec;
	}
}