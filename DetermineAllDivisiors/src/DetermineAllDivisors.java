import java.util.Scanner;

public class DetermineAllDivisors {

	public static void main(String[] args) {
		System.out.println("Írjon be egy számot, aminek az osztóit megkereshetem: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine();
		int[] divisors = determineDivisors(number);
		for (int divisor : divisors) {
			if (divisor == 0) {				//Amint az osztó eléri a 0-át leállítja a programot.
				break;
			}
			System.out.println(divisor);
		}
		scanner.close();
	}

	static int[] determineDivisors(int number) {
		int[] divisors = new int[number / 2];
		int counter = 0;
		for (int possibleDivisor = 2; possibleDivisor <= number / 2; possibleDivisor++) {
			if (number % possibleDivisor == 0) {
				divisors[counter++] = possibleDivisor; // a counter értéke lesz a tömb indexe, amit minden lefutásnál növelem!
			}
		}
		return divisors;
	}
}
