import java.util.Scanner;

public class SumOfNumberOfDigits {

	static Scanner sc;
	static int number;

	public static void main(String[] args) {

		welcome();
		getNumber();
		
		int lastDigit = number % 10;
		int numberOfDigit = number / 10;
		System.out.println(numberOfDigit + " és " + lastDigit);

	}

	private static int getNumber() {
		do {
			try {
				System.out.print("\nKérem adjon meg egy számot: ");
				sc = new Scanner(System.in);
				number = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott adat érvénytelen.");
			}
		} while (number > Integer.MAX_VALUE);
		return number;
	}

	private static void welcome() {
		System.out.print("Üdvözlöm én a számítógép vagyok.\n"
				+ "A mostani programban azt fogom megvizsgálni, hogy az Ön által megadott szám számjegyeinek mennyi az összege.\n");
	}

}
