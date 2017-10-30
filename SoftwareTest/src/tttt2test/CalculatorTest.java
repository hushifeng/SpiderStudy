package tttt2test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testparseCommand() throws CommandNotFoundException {
		Calculator ca=new Calculator();
		ca.parseCommand("exit");
		ca.parseCommand("help");
		ca.parseCommand("help vars");
		ca.parseCommand("help funcs");
		ca.parseCommand("help cmds");
		ca.parseCommand("list");
//		ca.parseCommand("list vars");
		ca.parseCommand("list funcs");
	}

}
