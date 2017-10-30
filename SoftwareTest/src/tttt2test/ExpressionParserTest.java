package tttt2test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ExpressionParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testaddVariable() {
		ExpressionParser ex=new ExpressionParser(3);
		ex.addVariable("A", "5");
		ex.addVariable("A", "7");
		ex.addVariable("B", "5");
		ex.addVariable("C", "6");
	}
	
	@Test
	public void testevaluate() throws ExpressionParserException {
		ExpressionParser ex=new ExpressionParser(3);
		ex.addVariable("A", "5");
		ex.addVariable("B", "6");
//		ex.evaluate("");
		ex.evaluate("5");
		ex.evaluate("A = 5");
		ex.evaluate("B = <A> + 1");
		ex.evaluate("-(<A>^2 + <B>^2)^0.5");
		ex.evaluate("-sin[<A> / 2]");
	}

}
