package tttttt2test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Indicate that this switch does not take any parameters, but is a toggle that
 * is provided. The toggle has a boolean value parameter, which is intended to
 * separate "on-switches" from "off-switches" (for instance, --enable-logging,
 * --disable-logging)
 * 
 * @Param value A boolean parameter that will be provided as parameter to the
 *        associated setter
 */
public @interface Toggle {
	boolean value();
}
