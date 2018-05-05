import java.util.Scanner;

public class Calculator {

	static double numberA;
	static double numberB;
	static double numberC;

	public static void functions(Scanner sc, int menuNumber) {
		if (menuNumber == 1 || menuNumber == 2 || menuNumber == 3 ||menuNumber == 4) {
			numberA = GetInput.getNumbers(sc, 1);
			numberB = GetInput.getNumbers(sc, 2);
		}
		switch (menuNumber) {
		case 1:
			numberC = numberA + numberB;
			Information.result("A számok összege: ", numberC);
			break;
		case 2:
			numberC = numberA - numberB;
			Information.result("A számok különbsége: ", numberC);
			break;
		case 3:
			numberC = numberA * numberB;
			Information.result("A számok szorzata: ", numberC);
			break;
		case 4:
			numberC = numberA / numberB;
			Information.result("Az osztás eredménye: ", numberC);
			break;
		case 5:
			break;
		default:
			System.out.println("A megadott szám érvénytelen!\n");
			break;
		}
	}
}