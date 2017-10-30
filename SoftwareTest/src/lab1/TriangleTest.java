package lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {
	Triangle triangle = new Triangle();
	private String param_a, param_b, param_c;
	private String result;

	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(param_a, param_b, param_c);
	}

	/**
	 * @param param
	 * @param result
	 */
	public TriangleTest(String param_a, String param_b, String param_c,
			String result) {
		this.param_a = param_a;
		this.param_b = param_b;
		this.param_c = param_c;
		this.result = result;
	}

	@Parameters
	public static Collection data() {
		return Arrays
				.asList(new Object[][] {
						{
								"a",
								"1",
								"1",
								"Side 1 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\n" },
						{
								"1",
								"a",
								"1",
								"Side 2 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\n" },
						{
								"1",
								"1",
								"a",
								"Side 3 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\n" },
						{
								"a",
								"1111111",
								"1111111",
								"Side 1 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\nI feel your triangle is too big\n" },
						{
								"1111111",
								"a",
								"1111111",
								"Side 2 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\nI feel your triangle is too big\n" },
						{
								"1111111",
								"1111111",
								"a",
								"Side 3 is not a number!\nAt least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\nI feel your triangle is too big\n" },
						{
								"1",
								"2",
								"0",
								"At least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\n" },
						{
								"1000000",
								"2000000",
								"0",
								"At least one length is less than 0!\nThe lengths of the triangles do not form a valid triangle!\nI feel your triangle is too big\n" },
						{
								"1000000",
								"2000000",
								"12",
								"The lengths of the triangles do not form a valid triangle!\nI feel your triangle is too big\n" },
						{ "1111111", "1111111", "1111111",
								"I feel your triangle is too big\n" },
						{ "7", "7", "7", "Equilateral" },
						{ "8", "8", "2", "Isosceles" },
						{ "3", "4", "5", "Scalene" }, });

	}

	@Test
	public void test() {
		assertEquals(result, triangle.determineTriangleType());
	}

}
