import java.util.Scanner;

public class LastDigitZero {

	static Scanner sc;
	public static void main(String[] args) {

		int[] numbers = new int[2];
		int numberIndex = 1;
		int lastDigit;
		boolean choice = false;
		
		System.out.println("Kérem adja meg a vizsgálandó számokat.");
		for(int i = 0; i <= 1; i++) {
			System.out.print(numberIndex + " - szám: ");
			sc= new Scanner(System.in);
			numbers[i] = sc.nextInt();
			sc.nextLine();
			numberIndex++;
		}
		
		int i = numbers[0];
		do {
			lastDigit = i % 10;
			if(lastDigit == 0) {
				System.out.println("A(z) " + i + " 0-ra végződő szám.");
				choice = true;
			}
			i++;
		}while(i <= numbers[1]);
			if(choice == false) {
			System.out.println(numbers[0] + " és " + numbers[1] + " között nincs nullára végződő szám.");
			}
	sc.close();
	}
}