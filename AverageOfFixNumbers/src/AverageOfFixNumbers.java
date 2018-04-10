import java.util.Scanner;

public class AverageOfFixNumbers {

	static Scanner sc;
	static double number;

	public static void main(String[] args) {

		double sumNumber = 0;
		System.out.println("Beírt számok átlagának kiszámtása.");
		System.out.print("Kérem adja meg meddig fusson a program: ");
		sc = new Scanner(System.in);
		int endNumber = sc.nextInt();
		sc.nextLine();

		for (int j = 0; j < endNumber; j++) {
			System.out.print("\nKérem adja meg a számot: ");
			sc = new Scanner(System.in);
			number = sc.nextDouble();
			sc.nextLine();
			sumNumber = sumNumber + number;
		}

		double averageNumber = sumNumber / endNumber;
		System.out.println(averageNumber);
		sc.close();
	}
}
