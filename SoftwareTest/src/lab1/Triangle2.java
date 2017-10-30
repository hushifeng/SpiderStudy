package lab1;

import java.util.Scanner;

public class Triangle2 {

	private int a;
	private int b;
	private int c;
	private int max, count;
	private boolean IsATriangle;

	public String begin() {
		String err = "";
		System.out.println("Enter the parameters, max and count:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] c = s.split(",");
		try {
			this.max = Integer.parseInt(c[0]);
		} catch (NumberFormatException e) {
			err += "Max is not a number!\n";
		}
		try {
			this.count = Integer.parseInt(c[1]);
		} catch (NumberFormatException e) {
			err += "Count is not a number!\n";
		}
		return err;
	}

	public String input() {
		String err = "";
		System.out
				.println("Enter three integers which are sides of a triangle");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] c = s.split(",");
		try {
			this.a = Integer.parseInt(c[0]);
		} catch (NumberFormatException e) {
			err += "Side a is not a number!\n";
		}
		try {
			this.b = Integer.parseInt(c[1]);
		} catch (NumberFormatException e) {
			err += "Side b is not a number!\n";
		}
		try {
			this.c = Integer.parseInt(c[2]);
		} catch (NumberFormatException e) {
			err += "Side c is not a number!\n";
		}
		return err;
	}

	public String determine() {
		String type = "";
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
			this.IsATriangle = true;
		} else
			this.IsATriangle = false;
		if (IsATriangle) {
			if ((a == b) && (b == c)) {
				type = "Triangle is Equilateral";
			} else if ((a == b) || (a == c) || (c == b)) {
				type = "Triangle is Isosceles";
			} else {
				type = "Triangle is Scalene";
			}
		} else
			type = "Not a Triangle";
		return type;
	}

	public void run() {
		String err = begin();
		if (err == "") {
			while (count > 0 && count <= max) {
				err = input();
				if (err == "") {
					System.out.println("Side A is " + a + " Side B is " + b
							+ " Side C is " + c);
					System.out.println(determine());
				} else {
					System.out.println(err);
				}
				count++;
			}
		} else {
			System.out.println(err);
		}
	}

	public static void main(String args[]) {
		Triangle2 triangle2 = new Triangle2();
		triangle2.run();
	}
}
