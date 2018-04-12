import java.util.Scanner;

public class CreatedNumberDivideThree {

	static Scanner sc;
	static int number;
	static int k = 0;
	static int j = 0;
	static String yes = "i";
	static String strNumber = "";
	static long createdNumber = 0L;

	public static void main(String[] args) {
		String no = "n";
		String response;
		boolean dividePosible = false;
		int[] numbers = new int[10];
		System.out.println("Alkotott szám hárommal való oszthatóságának vizsgálata.\n");
		do {
			sc = new Scanner(System.in);
			System.out.print("Kérem írjon be egy 100-nál kisebb számot: ");
			number = sc.nextInt();
			sc.nextLine();
			if (number >= 100) {
				System.out.println("A megadott szám nagyobb 100-nál.");
			}
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
					strNumber = strNumber + numbers[i];
				}
				createdNumber = Long.parseLong(strNumber);
				System.out.println(createdNumber);
				if (createdNumber % 3 == 0) {
					System.out.println("A szám osztható 3-mal.");
				} else {
					System.out.println("A szám nem osztható 3-mal.");
				}
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = 0;
				}
			}
			if (!dividePosible) {
				System.out.println("A megadott szám és az az alatti számok között egyik sem osztható 10-zel.");
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
		if(response.equals(yes)) {
			k = 0;
			j = 0;
			strNumber = "";
			createdNumber = 0L;
		}
		return response;
	}

}
