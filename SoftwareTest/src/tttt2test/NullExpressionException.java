package tttt2test;
/**
 * Exception thrown when an expression passed to ExpressionParser is empty.
 * 	@since		1.0
 */

public class NullExpressionException extends ExpressionParserException {
	
	/**
	 * Constructor of NullExpressionException.
	 *
	 * 	@since	1.0
	 */

	public NullExpressionException () {
		super("");
	}
} 
