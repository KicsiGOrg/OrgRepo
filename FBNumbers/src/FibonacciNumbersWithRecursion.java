public class FibonacciNumbersWithRecursion {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + ". Fibonacci szám: " + calculateFibonacciNumber(i));
		}
	}
	private static int calculateFibonacciNumber(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return calculateFibonacciNumber(n - 2) + calculateFibonacciNumber(n - 1);
		}
	}
}
