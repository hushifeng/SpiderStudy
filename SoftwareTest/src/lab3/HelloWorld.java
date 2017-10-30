package lab3;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rand = (int) (Math.random() * 100);
		if (rand % 2 == 0) {
			System.out.println("Hello, world! 0");
		} else
			System.out.println("Hello, world! 1");

		int result = rand % 2 == 0 ? rand + rand : rand * rand;
		System.out.println(result);
	}
}
