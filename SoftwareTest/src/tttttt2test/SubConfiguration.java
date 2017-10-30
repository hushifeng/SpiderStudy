package tttttt2test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Specifies a complex parameter type, represented by a full annotation option
 * specification
 * 
 * @param value
 *            The class that should be instantiated and used to parse the option
 *            value
 */
public @interface SubConfiguration {
	Class<? extends Object> value();
}
