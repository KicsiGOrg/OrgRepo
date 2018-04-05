import java.util.Scanner;

public class Calculator {

	static double numberA;
	static double numberB;

	public static void main(String[] args) {

		String menu = "SZÁMOLÓGÉP MENÜSOR\n" + "------------------\n" + "1 - Összeadás\n" + "2 - Kivonás\n" + "3 - Szorzás\n" + "4 - Osztás\n" + "5 - Kilépés\n";
		System.out.println("Üdvözlöm én a számológép vagyok!\n");
		Scanner sc;
		int menuNumber;

		do {
			System.out.println(menu);
			System.out.print("Kérem a menüből válassza ki milyen műveletet hajtsak végre és annak számát írja ide: ");
			sc = new Scanner(System.in);
			menuNumber = sc.nextInt();
			sc.nextLine();
			functions(sc, menuNumber);
		} while (menuNumber != 5);

		sc.close();
	}

	private static void functions(Scanner sc, int menuNumber) {
		switch (menuNumber) {
		case 1:
			getNumbers(sc);
			add(numberA, numberB);
			break;
		case 2:
			getNumbers(sc);
			subtract(numberA, numberB);
			break;
		case 3:
			getNumbers(sc);
			multiply(numberA, numberB);
			break;
		case 4:
			getNumbers(sc);
			divide(numberA, numberB);
			break;
		case 5:
			SayBye();
			break;
		default:
			System.out.println("A megadott szám érvénytelen!\n");
			break;
		}
	}

	private static void getNumbers(Scanner sc) {
		System.out.print("Kérem adja meg az első számot: ");
		numberA = sc.nextDouble();
		sc.nextLine();
		System.out.print("Kérem adja meg a második számot: ");
		numberB = sc.nextDouble();
		sc.nextLine();
	}

	private static void SayBye() {
		System.out.println("Köszönöm, hogy igénybe vette a szolgáltatásaimat. \nViszont látásra!");
	}

	private static void divide(double numberA, double numberB) {
		double numberC = numberA / numberB;
		System.out.println("Az osztás eredménye: " + numberC + "\n");
	}

	private static void multiply(double numberA, double numberB) {
		double numberC = numberA * numberB;
		System.out.println("A számok szorzata: " + numberC + "\n");
	}

	private static void subtract(double numberA, double numberB) {
		double numberC = numberA - numberB;
		System.out.println("A számok különbsége: " + numberC + "\n");
	}

	private static void add(double numberA, double numberB) {
		double numberC = numberA + numberB;
		System.out.println("A számok összege: " + numberC + "\n");
	}

}