import java.util.Scanner;

public class AverageOfSomeNumbersOne {

	static Scanner sc;
	static int number;

	public static void main(String[] args) {

		int i = 1;
		int sumNumber = 0;
		System.out.println(
				"Beírt számok átlag kiszámítása.\nA számok bevitele addig tart, amíg a felhasználó nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nKérem adja meg a számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if (number == 0) {
				i--;
			} else {
				sumNumber = sumNumber + number;
				i++;
			}
		} while (number != 0);

		double averageNumber = sumNumber / i;
		System.out.println(averageNumber);

		sc.close();
	}
}