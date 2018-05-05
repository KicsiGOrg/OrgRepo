import java.util.Scanner;

public class GetInput {

	public static double getInput(Scanner sc, String message, int index) {
		double input = 0;
		boolean response = false;
		do {
			try {
				if (index == 0) {
					System.out.print(message);
					sc = new Scanner(System.in);
					input = sc.nextInt();
					sc.nextLine();
					if (input < 100 || input > 200) {
						System.out.println("A megadott input érvénytelen.");
						response = false;
					} else {
						input = input / 100;
						response = true;
					}
				} else if (index == 1) {
					System.out.print(message);
					sc = new Scanner(System.in);
					input = sc.nextInt();
					sc.nextLine();
					if (input < 40 || input > 300) {
						System.out.println("A megadott input érvénytelen.");
						response = false;
					} else {
						response = true;
					}
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
			}
		} while (!response);
		return input;
	}
}
