package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FormulasTest {

	Formulas formulas = new Formulas();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		assertEquals(2, formulas.clip(1, 2, 3));
		assertEquals(1, formulas.clip(1, 2, 0));
		assertEquals(1, formulas.clip(1, 2, 1));
		assertEquals(2, formulas.clip(1, 2, 2));
		assertEquals(2, formulas.clip(2, 2, 2));

		assertEquals(3, formulas.max(1, 2, 3));
		assertEquals(1, formulas.max(1, 1, 1));
		assertEquals(3, formulas.max(3, 1, 2));
		assertEquals(3, formulas.max(2, 1, 3));
		assertEquals(2, formulas.max(-1, 2, -3));
	}

}
