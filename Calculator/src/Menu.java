import java.util.Scanner;

public class Menu {

	public static int menuIndex() {
		Scanner sc = null;
		int menuNumber = 0;
		do {
			try {
				menuNumber = 0;
				Information.menu();
				System.out
						.print("Kérem a menüből válassza ki milyen műveletet hajtsak végre és annak számát írja ide: ");
				sc = new Scanner(System.in);
				menuNumber = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("A megadott input nem értelmezett.");
			}
			Calculator.functions(sc, menuNumber);
		} while (menuNumber != 5);
		return menuNumber;
	}
}
