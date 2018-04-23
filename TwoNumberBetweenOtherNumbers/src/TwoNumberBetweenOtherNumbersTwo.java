import java.util.Scanner;

public class TwoNumberBetweenOtherNumbersTwo {

	/*
	 * A program saját eljárása írja ki a paramétereiként átvett két szám közötti
	 * egész számokat. ha a paraméterek sorrendje nem megfelelő, az eljárás írjon ki
	 * hiba üzenetet.
	 */

	static Scanner sc = new Scanner(System.in);
	static int numberMin;
	static int numberMax;
	static boolean valid = false;

	public static void main(String[] args) {
		System.out.println(
				"A program célja kiírni két szám között található összes egész számot.\nA számok sorrendje alapján kezdjen a kisebbik számmal.");
		getNumbers();
		sc.close();
		printNumbers(numberMin, numberMax);
	}

	private static void getNumbers() {
		int i = 1;
		System.out.print("Kérem adjon meg az " + i + " számot: ");
		numberMin = sc.nextInt();
		sc.nextLine();
		i++;
		do {
			System.out.print("Kérem adjon meg az " + i + " számot: ");
			numberMax = sc.nextInt();
			sc.nextLine();
			if (numberMin > numberMax) {
				System.out.println("Az elsőnek megadott szám nagyobb, mint a másodiknak megadott.");
				valid = false;
			} else {
				valid = true;
			}
		} while (!valid);
	}

	private static void printNumbers(int numberMin, int numberMax) {
		if (numberMin == numberMax) {
			System.out.println("A megadott számok megegyeznek.");
		} else if (numberMax == numberMin + 1) {
			System.out.println(numberMin + " és " + numberMax + " között nincsenek egész számok.");
		} else {
			System.out.print(numberMin + " és " + numberMax + " közötti számok:");
			for (int i = numberMin + 1; i < numberMax; i++) {
				if (i != numberMax - 1) {
					System.out.print(" " + i + ",");
				} else {
					System.out.print(" " + i);
				}
			}
		}
	}
}