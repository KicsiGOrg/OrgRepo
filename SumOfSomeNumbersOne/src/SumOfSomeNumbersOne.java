import java.util.Scanner;

public class SumOfSomeNumbersOne {

	static Scanner sc;
	static double number;

	public static void main(String[] args) {

		double sumNumber = 0;
		System.out.println(
				"Beírt számok összegének kiszámítása.\nA számok bevitele addig tart, amíg a felhasználó nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nKérem adja meg a számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			sumNumber = sumNumber + number;
		} while (number != 0);
		sc.close();
		System.out.println("\n" + sumNumber);
	}
}