package tttttt2test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Indicates that this option is required. If no matching parameter is provided
 * during parsing, an exception will be thrown
 */
public @interface Required {
}