import java.util.Scanner;

public class SumOfFixNumbers {

	static Scanner sc;
	static double number;
	static double endNumber;
	static double sumNumber;
	
	public static void main(String[] args) {

		getEndNumber();
		getNumbersAndSummation(); 
		sc.close();
		System.out.println("\n" + sumNumber);
	}

	private static void getNumbersAndSummation() {
		for(int i = 0; i < endNumber; i++) {
			System.out.print("\nKérem adja meg a számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			sumNumber = sumNumber + number;
		}
	}

	private static void getEndNumber() {
		System.out.print("Kérem adja meg, hány szám összegét számoljam ki: ");
		sc = new Scanner(System.in);
		endNumber = sc.nextInt();
		sc.nextLine();
	}

}
