import java.util.Scanner;

public class PrimeBetweenTwoNumber {

	static Scanner sc = new Scanner(System.in);
	static int minNumber;
	static int maxNumber;
	static int counter = 0; 
	
	public static void main(String[] args) {
		getNumbers();
		sc.close();
		switchNumbers();
		printPrimes();
	}

	private static void printPrimes() {
		System.out.println(minNumber + " és " + maxNumber + " között: ");
		for (int i = minNumber; i <= maxNumber; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
			}
		}
		if(counter == 0) {
			System.out.println("Nincsenek prímszámok.");
		}
	}

	private static void switchNumbers() {
		if(minNumber > maxNumber) {
			int temp = minNumber;
			minNumber = maxNumber;
			maxNumber = temp;
		}
	}

	private static void getNumbers() {
		System.out.println("Prím szám kereső program két szám között.");
		for(int i = 1; i < 3; i++) {
		System.out.print("Kérem adja meg az " + i + " számot: ");
			if(i == 1){
				minNumber = sc.nextInt();
				sc.nextLine();
			}else {
				maxNumber = sc.nextInt();
				sc.nextLine();
			}
		}
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor <= Math.sqrt(number); possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		counter++;
		return true;
	}
}