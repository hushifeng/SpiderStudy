package tttttt2test;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Indicates that the setter method handles parameters that are not parameters to a switch.
 * If this option is specified, LongSwitch and ShortSwitch can not be specified 
 */
public @interface LooseParameters {
}
