import java.util.Scanner;

public class PiApproach {

	static int number = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("A program célja végtelen összeggel és szorzattal való közelítés.");
		getNumber(sc);
		int input = number;

		eulersLine(input);
	}

	private static void eulersLine(int input) {
		System.out.print("Euler féle sor alapján: ");
		double a = Math.pow(Math.PI, 2) / 6.0;
		System.out.print("Pí\u00b2 / 6 = " + a + " = ");
		double b = 0.0;
		for (int i = 2; i <= input + 1; i++) {
			b = b + (1 / Math.pow(i, 2));
		}
		b = b + 1.0;
		System.out.print(b);
	}

	private static int getNumber(Scanner sc) {
		do {
			try {
				System.out.print("\nKérem adjon meg egy egész számot: ");
				number = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezhető.");
			}
		} while (number <= 0);
		sc.close();
		return number;
	}
}
