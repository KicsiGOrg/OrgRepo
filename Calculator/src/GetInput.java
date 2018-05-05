import java.util.Scanner;

public class GetInput {

	public static double getNumbers(Scanner sc, int index) {
		double number = 0.0;
		boolean result = false;
		do {
			try {
				System.out.print("Kérem adja meg az " + index + " számot: ");
				number = sc.nextDouble();
				sc.nextLine();
				result = true;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
				result = false;
			}
		} while (!result);
		return number;
	}
}
