import java.util.Scanner;

public class NumberOfSessions {

	static int n;
	static Scanner sc;
	static int[] numbers;
	static int nS = 1;
	static int number;
	static int i = 0;

	public static void main(String[] args) {

		getN();
		numbers = new int[n];

		do {
			getNumber();
			nS++;
		} while (nS != n + 1);

		sc.close();

		printToConsole();
	}

	//Ha a 0-át egyszer ki kell írni

	private static void printToConsole() {
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				System.out.print(i + "");
			}
			for (int j = 0; j < numbers[i]; j++) {
				System.out.print(numbers[i]);
			}
			System.out.println();
		}
	}

	// Ha a 0-át egyszer sem kell kiírni
	// private static void printToConsole() {
	// for (int i = 0; i < numbers.length; i++) {
	// for (int j = 0; j < numbers[i]; j++) {
	// System.out.print(numbers[i]);
	// }
	// System.out.println();
	// }
	// }

	private static void getNumber() {

		System.out.print("Kérem adjon meg az - " + nS + "/" + n + " - [0 és 9] közötti számot: ");
		number = sc.nextInt();
		sc.nextLine();
		if (number < 0 || number > 9) {
			System.out.println("A megadott szám nem esik a határok közé.\nKérem ismételje meg.");
			nS--;
		} else {
			numbers[i] = number;
			i++;
		}
	}

	private static void getN() {
		sc = new Scanner(System.in);
		System.out.print("N: ");
		n = sc.nextInt();
		sc.nextLine();

	}

}
