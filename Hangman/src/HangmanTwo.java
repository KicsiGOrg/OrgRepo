import java.util.Random;
import java.util.Scanner;

public class HangmanTwo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String riddle = getRiddle();
		char[] maskedRiddle = maskedSolution(riddle);
		char[] wrongLetters = new char[10];
		int mistakes = 0;
		do {
			printMaskedRiddle(maskedRiddle);
			char letter = getInput();
			boolean y = x(riddle, maskedRiddle, letter);
			if(!y) {
				wrongLetters[mistakes] = letter;
				mistakes++;
			}
			printWrongLetters(wrongLetters, mistakes);
		}
		while(mistakes < 10 && !isSolved(maskedRiddle));
		printMaskedRiddle(maskedRiddle);
		System.out.println("Vége a játéknak, " + (isSolved(maskedRiddle) ? "Ön nyert!" : "Ön vesztett!"));
		if (!isSolved(maskedRiddle)) {
			System.out.println("A feladvány: " + riddle);
		}
		sc.close();
	}

	private static void printWrongLetters(char[] wrongLetters, int mistakes) {
		System.out.print("A következő " + mistakes + " betűk nincsenek benne a megfejtésben: ");
		String separator = "";
		for (int i = 0; i < mistakes; i++) {
			System.out.print(separator + wrongLetters[i]);
			separator = ", ";
		}
		System.out.println();
	}

	private static char[] maskedSolution(String riddle) {
		char[] mask = new char[riddle.length()];
		for (int i = 0; i < riddle.length(); i++) {
			if (riddle.charAt(i) == ' ') {
				mask[i] = ' ';
			} else {
				mask[i] = '_';
			}
		}
		return mask;
	}

	private static boolean isSolved(char[] solution) {
		for (int i = 0; i < solution.length; i++) {
			if (solution[i] == '_') {
				return false;
			}
		}
		return true;
	}
	
	private static String getRiddle() {
		String[] riddleArray = { "Almafa", "Körtefa", "Szilvafa", "Akasztófa", "Bitófa", "Ajtófélfa" };
		Random random = new Random();
		int randomIndex = random.nextInt(riddleArray.length);
		return riddleArray[randomIndex].toUpperCase();
	}

	private static void printMaskedRiddle(char[] maskedRiddle) {
		for (char c : maskedRiddle) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	private static char getInput () {
		System.out.print("Kérem adjon meg egy betűt: ");
		String input = sc.nextLine();
		String inputUpperCase = input.toUpperCase();
		char firstLetter = inputUpperCase.charAt(0);
		return firstLetter;
	}

	private static boolean x(String riddle, char[] maskedRiddle, char letter) {
		boolean xy = false;
		for(int i = 0; i < riddle.length(); i++) {
			if(riddle.charAt(i) == letter) {
				maskedRiddle[i] = letter;
				xy = true;
			}
		}
		return xy;
	}
}
