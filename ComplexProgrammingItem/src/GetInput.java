import java.util.Scanner;

public class GetInput {

	public static int getInput(Scanner sc) {
		int number = 0;
		boolean input;
		do {
			try {
				System.out.print("Kérem adja meg a tömb méretét egész számban: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number < 1) {
					System.out.println("A megadott szám túl kicsi, kérem adjon meg 0-nál nagyobb számot.");
					input = false;
				} else {
					input = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezett.");
				input = false;
			}
		} while (!input);
		sc.close();
		return number;
	}
}
