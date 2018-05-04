import java.util.Scanner;

public class Menu {

	public static int menu(Scanner sc) {
		int menuIndex = 0;
		boolean input = false;
		System.out.println("Összetett programozási tételek!");
		do {
			try {
				System.out.println("\n       Menü\n-----------------\n 1 - Másolás\n 2 - Rendezés\n 3 - Kiválogatás");
				System.out.print("\nKérem válasszon az alábbi menüből: ");
				menuIndex = sc.nextInt();
				sc.nextLine();
				if (menuIndex == 1 || menuIndex == 2 || menuIndex == 3) {
					input = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezett.");
				input = false;
			}
		} while (!input);
		return menuIndex;
	}
}
