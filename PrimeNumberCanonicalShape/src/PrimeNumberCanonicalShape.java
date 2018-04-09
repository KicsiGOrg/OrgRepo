import java.util.Scanner;

public class PrimeNumberCanonicalShape {

	public static void main(String[] args) {

		System.out.print("Kérem adjon be egy számot: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();

		for (int i = 2; i <= number; i++) {
			if (isPrime(i) && number % i == 0) {
				do {
					System.out.println(number + "|" + i);
					number = number / i;
				} while (number % i == 0);
			}
		}
		System.out.println("1|-");
		sc.close();
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}