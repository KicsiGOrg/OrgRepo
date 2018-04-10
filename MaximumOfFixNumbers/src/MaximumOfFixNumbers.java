import java.util.Scanner;

public class MaximumOfFixNumbers {

	static Scanner sc;
	static double number;
	static double endNumber;
	static double maxNumber = Integer.MIN_VALUE;
	
	public static void main(String[] args) {

		System.out.print("Kérem adja meg, hány számból keressem ki a maximumot: ");
		sc = new Scanner(System.in);
		endNumber = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < endNumber; i++) {
			System.out.print("\nKérem adjon meg egy számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if(number > maxNumber) {
				maxNumber = number;
			}
		} 
		sc.close();
		System.out.println("\n" + maxNumber);

	}

}
