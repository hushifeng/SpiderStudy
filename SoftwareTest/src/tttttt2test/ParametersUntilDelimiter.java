package tttttt2test;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Indicates that this option takes any number of parameters, which is terminated either by the end of the
 * parameter list, or by a delimiter. All values encountered until the delimiter will be taken as parameters,
 * even if they starts with a hyphen. The delimiter is not kept as part of the parameter list.
 * 
 * @Param the delimiter used to end the parameter list
 */
public @interface ParametersUntilDelimiter {
	String value();
}
