public class Factorial {

	public static void main(String[] args) {

		int[] numberArrays = { 0, 1, 5, 7, 10 };

		for (int number : numberArrays) {
			factorial(number);
		}
	}

	private static int factorial(int number) {
		int factorialNumber = 1;
		if (number == 0) {
			System.out.println(number + "! = 1");
		} else {
			for (int i = number; i > 0; i--) {
				factorialNumber = factorialNumber * i;
			}
			System.out.println(number + "! = " + factorialNumber);
		}
		return number;
	}

}