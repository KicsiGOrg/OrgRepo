import java.util.Scanner;

public class TwoNumberBetweenOtherNumbersThree {

	/*
	 * A program saját eljárása írja ki a paramétereiként átvett két szám közötti egész számokat.
	 * Ha a paraméterek sorrendje nem megfelelő az eljárás cserélje fel azokat.
	 */
	
	static Scanner sc = new Scanner(System.in);
	static int numberMin;
	static int numberMax;

	public static void main(String[] args) {

		getNumbers();
		sc.close();
		printNumbers(numberMin, numberMax);
	}

	private static void getNumbers() {
		for (int i = 1; i <= 2; i++) {
			System.out.print("Kérem adjon meg az " + i + " számot: ");
			if (i == 1) {
				numberMin = sc.nextInt();
			} else {
				numberMax = sc.nextInt();
			}
			sc.nextLine();
		}
		switchNumbers();
	}

	private static void switchNumbers() {
		if(numberMin > numberMax) {
			int temp = numberMin;
			numberMin = numberMax;
			numberMax = temp;
		}
	}

	private static void printNumbers(int numberMin, int numberMax) {
		if (numberMin == numberMax) {
			System.out.println("A megadott számok megegyeznek.");
		} 
		else if(numberMax == numberMin+1) {
			System.out.println("A megadott számok között nincsenek egész számok.");
		}
		else {
			System.out.print(numberMin + " és " + numberMax + " közötti számok:");
			for (int i = numberMin + 1; i < numberMax; i++) {
				if(i != numberMax-1) {
					System.out.print(" " + i + ",");
				}else {
					System.out.print(" " + i);
				}
			}
		}
	}
}