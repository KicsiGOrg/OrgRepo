import java.util.Scanner;

public class MaximumOfFixNumbersOne {

	static Scanner sc;
	static double number;
	static double maxNumber = Integer.MIN_VALUE;

	public static void main(String[] args) {

		System.out.println("Beírt számok maximumának kikeresése.");
		System.out.print("Kérem adja meg meddig fusson a program: ");
		sc = new Scanner(System.in);
		int endNumber = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < endNumber; i++) {
			System.out.print("\nKérem adjon meg egy számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		sc.close();
		System.out.println("\nA beírt számok maximuma: " + maxNumber);
	}
}
