package tttttt2test;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Indicates that an option may occur multiple times. The result of the different instances is gathered
 * in a list. This is done even if the result is already a list (for instance if the option takes multiple
 * parameters). For instance, the parameter type of an option with @Multiple and @AllAvailable specified, will
 * need to have an parameter type of List<List<String>>. 
 */
public @interface Multiple {
}
