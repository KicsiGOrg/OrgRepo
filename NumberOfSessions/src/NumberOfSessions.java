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
			if(n != 0) {
				getNumber();
				nS++;
			}
			else {
				System.out.println("0 db szám megadását választotta, ezért a program leállt.");
			}
		} while (nS != n + 1);

		sc.close();

		printToConsole();
	}

	private static void printToConsole() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				System.out.print("0");
			}
			for (int j = 0; j <= numbers[i]; j++) {
				if(numbers[i] != 0) {
					System.out.print(numbers[i]);
				}
			}
			System.out.println();
		}
	}

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
		do {
			sc = new Scanner(System.in);
			System.out.print("N: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n < 0) {
				System.out.println("A megadot szám kisebb, mint 0.\nKérem adjon meg egy nullánál nagyobb számot.");
			}
		} while (n < 0);
	}
}
