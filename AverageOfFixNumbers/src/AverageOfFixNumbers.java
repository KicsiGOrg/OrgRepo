import java.util.Scanner;

public class AverageOfFixNumbers {

	static Scanner sc;
	static double number;
	static double endNumber;
	
	public static void main(String[] args) {

		
		double sumNumber = 0;
		System.out.print("Kérem adja meg, hány szám átlagát számoljam ki: ");
		sc = new Scanner(System.in);
		endNumber = sc.nextInt();
		sc.nextLine();
		
		for(int j = 0; j < endNumber; j++) {
			System.out.print("\nKérem adja meg a számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
				sumNumber = sumNumber + number;
		} 

		double averageNumber = sumNumber / endNumber;
		System.out.println(averageNumber);

		sc.close();
		
		
	}

}
