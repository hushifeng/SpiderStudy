package tttt2test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testisNumber() {
		MathParser ma=new MathParser();
		ma.isNumber("5");
		
	}
	
	@Test
	public void testfactorial() {
		MathParser ma=new MathParser();
		ma.factorial(1.5);
		ma.factorial(5);
	}
	
	@Test
	public void testsolveBinaryOperation() {
		MathParser ma=new MathParser();
		ma.solveBinaryOperation(5, "/", 6);
	}
}
