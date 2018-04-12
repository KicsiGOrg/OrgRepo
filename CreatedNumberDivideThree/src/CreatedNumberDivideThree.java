import java.math.BigDecimal;
import java.util.Scanner;

public class CreatedNumberDivideThree {

	static Scanner sc;
	static int number;
	static int k = 0;
	static int j = 0;
	static String yes = "i";
	static String strNumber = "";
	static long createdNumber = 0;
	static int[] numbers;
	static BigDecimal zero = new BigDecimal(0);

	public static void main(String[] args) {
		String no = "n";
		String response;
		boolean dividePosible = false;
		numbers = new int[10];

		System.out.println("Alkotott szám hárommal való oszthatóságának vizsgálata.\n");

		do {
			sc = new Scanner(System.in);
			System.out.print("Kérem írjon be egy 100-nál kisebb számot: ");
			number = sc.nextInt();
			sc.nextLine();
			if (number > 100) {
				System.out.println("A megadott szám nagyobb 100-nál.");
			} else {
				for (k = number; k >= 10; k--) {
					if (k % 10 == 0) {
						System.out.println(k);
						dividePosible = true;
						numbers[j] = k;
						j++;
					}
				}
				if (dividePosible) {
					for (int i = numbers.length - 1; i >= 0; i--) {
						if (numbers[i] != 0) {
							strNumber = strNumber + numbers[i];
						}
					}
					System.out.println("Összekonkatenált számok decimális formában: " + strNumber);
					int strNumberLength = strNumber.length();
					if (strNumberLength > 18) {
						BigDecimal nagy = new BigDecimal(strNumber);
						BigDecimal b = new BigDecimal("3");
						BigDecimal reminder = nagy.remainder(b);

						/*
						 * Tudom, hogy a megadott maximális szám már nem osztható 3-ma, de amennyiben
						 * bővítjük a felsőhatárt, úgy a tömb mérete és a befogadható maximális szám
						 * emelésével továbbra is használható marad(hat) a program (Nem teszteltem).
						 */

						if (reminder == zero) {
							System.out.println("\nA szám osztható 3-mal.");
						} else {
							System.out.println("\nA szám nem osztható 3-mal.");
						}
					} else {
						createdNumber = Long.parseLong(strNumber);
						if (createdNumber % 3 == 0) {
							System.out.println("\nA szám osztható 3-mal.");
						} else {
							System.out.println("\nA szám nem osztható 3-mal.");
						}
						for (int i = 0; i < numbers.length; i++) {
							numbers[i] = 0;
						}
					}
				}
				if (!dividePosible) {
					System.out.println("A megadott szám és az az alatti számok közül egyik sem osztható 10-zel.");
				}
			}
			response = response();

		} while (!response.equals(no));
		System.out.println("Köszönöm, hogy segíthettem :) ");
		sc.close();
	}

	private static String response() {
		String response;
		System.out.println("\nSzeretné újra futtatni a programot?\n");
		System.out.print("Kérem adja meg a válaszát (i vagy n): ");
		response = sc.next();
		sc.nextLine();
		switch (response) {
		case "i":
			break;
		case "n":
			break;
		default:
			System.out.println("A beírt választ nem értem.");
			System.out.print("Kérem adja meg a válaszát (i vagy n): ");
			response = sc.next();
			sc.nextLine();
			break;
		}
		if (response.equals(yes)) {
			k = 0;
			j = 0;
			strNumber = "";
			createdNumber = 0L;
			numbers = new int[10];
		}
		return response;
	}

}
