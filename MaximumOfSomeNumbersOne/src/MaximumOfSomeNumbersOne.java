import java.util.Scanner;

public class MaximumOfSomeNumbersOne {

	static Scanner sc;
	static double number;

	public static void main(String[] args) {

		double maxNumber = 0;
		System.out.println(
				"Beírt számok maximumának kikeresése.\nA számok bevitele addig tart, amíg a felhasználó nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nKérem adjon meg egy számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if(number > maxNumber) {
				maxNumber = number;
			}
		} while (number != 0);
		sc.close();
		System.out.println("\n" + maxNumber);
	}
}