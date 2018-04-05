import java.util.Scanner;

public class Calculator {

	static double numberA;
	static double numberB;

	public static void main(String[] args) {

		String menu = "SZÁMOLÓGÉP MENÜSOR\n" + "------------------\n" + "1 - Összeadás\n" + "2 - Kivonás\n"
				+ "3 - Szorzás\n" + "4 - Osztás\n" + "5 - Kilépés\n";
		System.out.println("Üdvözlöm én a számológép vagyok!\n");
		Scanner sc;
		int menuNumber;

		do {
			System.out.println(menu);
			System.out.print("Kérem a menüből válassza ki milyen műveletet hajtsak végre és annak számát írja ide: ");
			sc = new Scanner(System.in);
			menuNumber = sc.nextInt();
			sc.nextLine();
			if(menuNumber == 5) {
				byeBye();
			}
			else if (menuNumber > 0 && menuNumber < 5) {
				getNumbers(sc);
				if (menuNumber == 1) {
					sumNumber(numberA, numberB);
				} else if (menuNumber == 2) {
					subNumber(numberA, numberB);
				} else if (menuNumber == 3) {
					mulNumber(numberA, numberB);
				} else if (menuNumber == 4) {
					divNumber(numberA, numberB);
				} 
			} else {
				System.out.print("A megadott szám érvénytelen! Kérem adja meg a művelet számát: ");
				menuNumber = sc.nextInt();
				sc.nextLine();
			}
		} while (menuNumber != 5);

		sc.close();
	}

	private static void getNumbers(Scanner sc) {
		System.out.print("Kérem adja meg az első számot: ");
		numberA = sc.nextDouble();
		sc.nextLine();
		System.out.print("Kérem adja meg a második számot: ");
		numberB = sc.nextDouble();
		sc.nextLine();
	}

	private static void byeBye() {
		System.out.println("Köszönöm, hogy igénybe vette a szolgáltatásaimat. \nViszont látásra!");
	}

	private static void divNumber(double numberA, double numberB) {
		double numberC = numberA / numberB;
		System.out.println("Az osztás eredménye: " + numberC + "\n");
	}

	private static void mulNumber(double numberA, double numberB) {
		double numberC = numberA * numberB;
		System.out.println("A számok szorzata: " + numberC + "\n");
	}

	private static void subNumber(double numberA, double numberB) {
		double numberC = numberA - numberB;
		System.out.println("A számok különbsége: " + numberC + "\n");
	}

	private static void sumNumber(double numberA, double numberB) {
		double numberC = numberA + numberB;
		System.out.println("A számok összege: " + numberC + "\n");
	}

}