import java.util.Scanner;

public class Controller {

	public static void controller() {
		int menuNumber = 0;
		Scanner sc = null;
		do {
			try {
				menuNumber = 0;
				System.out.print("\nKérem válasszon a menüből: ");
				sc = new Scanner(System.in);
				menuNumber = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
			switch (menuNumber) {
			case 1:
				Converter.textToBinary(sc);
				break;
			case 2:
				Converter.binaryToText(sc);
				break;
			case 3:
				System.out.println("\nKöszönöm, hogy igénybe vette a szolgálataimat :) " + "\nViszontlátásra!");
				break;
			default:
				System.out.println("Hibás menüpont");
				break;
			}
		} while (menuNumber != 3);
		sc.close();
	}
}