package bisai;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {

	private static Triangle triangle = new Triangle(0, 0, 0);
	private long side1, side2, side3;
	private String type;

	public TriangleTest(long side1, long side2, long side3, String type) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.type = type;
	}

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { 2, 2, 2, "Regular" },
				{ 2, 2, 1, "Isosceles" }, { 3, 4, 5, "Scalene" },
				{ 1, 1, 2, "Illegal" }, });
	}

	@Test
	public void test() {
		Triangle triangle = new Triangle(side1, side2, side3);
		assertEquals(type, triangle.getType(triangle));
	}

}
