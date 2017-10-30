package lab1;

public class Formulas {

	public static int clip(int lower, int upper, int x) {

		if (x < lower) {
			x = lower;
		}

		if (x > upper) {

			x = upper;
		}
		return x;
	}

	public static int max(int a, int b, int c) {

		if (a < b) {

			if (b < c) {

				return c;

			} else {

				return b;
			}

		} else {

			if (a < c) {

				return c;
			} else {

				return a;

			}

		}

	}
}
