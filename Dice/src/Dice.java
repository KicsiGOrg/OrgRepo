import java.util.Random;
import java.util.Scanner;

public class Dice {

	static Scanner sc = new Scanner(System.in);
	static int diceOne = 0;
	static int diceTwo = 0;
	static int diceThree = 0;
	static int diceFour = 0;
	static int diceFive= 0;
	static int diceSix= 0;

	public static void main(String[] args) {
		
		int[] diceNumbers = {1,2,3,4,5,6};

		System.out.println("Kocka dobás számláló program.\n\nHányszor dobjak a kockával?");
		int number = 0; 

		number = getNumber();
		throwMethod(diceNumbers, number);
		printThrow(number);
	}

	private static int getNumber() {
		int number;
		do {
			System.out.print("Kérem adjon meg egy számot: ");
			number = sc.nextInt();
			sc.nextLine();
			if(number <= 0) {
				System.out.println("A megadott szám túl kicsi! ");
			}
		}while(number <= 0);
		sc.close();
		return number;
	}

	private static void printThrow(int number) {
		System.out.println(number + " dobásból.");
		System.out.println("1-es " + diceOne + " volt.");
		System.out.println("2-es " + diceTwo + " volt.");
		System.out.println("3-es " + diceThree + " volt.");
		System.out.println("4-es " + diceFour + " volt.");
		System.out.println("5-es " + diceFive + " volt.");
		System.out.println("6-es " + diceSix + " volt.");
	}

	private static void throwMethod(int[] diceNumbers, int number) {
		for (int i = 0; i < number; i++) {
			Random random = new Random();
			int randomIndex = random.nextInt(diceNumbers.length);
			switch (randomIndex) {
			case 0:
				diceOne++;
				break;
			case 1:
				diceTwo++;
				break;
			case 2:
				diceThree++;
				break;
			case 3:
				diceFour++;
				break;
			case 4:
				diceFive++;
				break;
			case 5:
				diceSix++;
				break;
			}
		}
	}
}