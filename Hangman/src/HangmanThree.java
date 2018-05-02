import java.util.Random;
import java.util.Scanner;

public class HangmanThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String riddleWord = generateRiddle();
		char[] solution = generateMaskedSolution(riddleWord);
		char[] wrongGuesses = new char[10];
		int numberOfWrongGuesses = 0;
		do {
			printRiddle(solution);
			char letter = readUserInput(scanner, "Kérem, adja meg a következő betűt: ");
			boolean goodGuess = updateSolution(riddleWord, solution, letter);
			if (!goodGuess) {
				wrongGuesses[numberOfWrongGuesses] = letter;
				numberOfWrongGuesses++;
			}
			printWrongLetters(wrongGuesses, numberOfWrongGuesses);
		} while (numberOfWrongGuesses < 10 && !isSolved(solution));
		printRiddle(solution);
		System.out.println("Vége a játéknak, " + (isSolved(solution) ? "Ön nyert!" : "Ön vesztett!"));
		if(!isSolved(solution)) {
			System.out.println("\nA megfejtés: " + riddleWord);
		}
		scanner.close();
	}

	private static void printWrongLetters(char[] wrongGuesses, int numberOfWrongGuesses) {
		System.out.format("Nincs benne ez a(z) %d betű: ", numberOfWrongGuesses);
		String separator = "";
		for (int i = 0; i < numberOfWrongGuesses; i++) {
			System.out.print(separator + wrongGuesses[i]);
			separator = ", ";
		}
		System.out.println();
	}

	private static boolean isSolved(char[] solution) {
		for (int i = 0; i < solution.length; i++) {
			if (solution[i] == '_') {
				return false;
			}
		}
		return true;
	}

	private static boolean updateSolution(String riddleWord, char[] solution, char guessedLetter) {
		boolean riddleWordContainsTheGuessedLetter = false;
		for (int i = 0; i < riddleWord.length(); i++) {
			if (riddleWord.charAt(i) == guessedLetter) {
				solution[i] = guessedLetter;
				riddleWordContainsTheGuessedLetter = true;
			}
		}
		return riddleWordContainsTheGuessedLetter;
	}

	private static char readUserInput(Scanner scanner, String askMessage) {
		System.out.print(askMessage);
		String word = scanner.nextLine().toUpperCase();
		char firstLetter = word.charAt(0);
		return firstLetter;
	}

	private static void printRiddle(char[] solution) {
		for (char c : solution) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	private static char[] generateMaskedSolution(String riddleWord) {
		char[] mask = new char[riddleWord.length()];
		for (int i = 0; i < mask.length; i++) {
			if (riddleWord.charAt(i) == ' ') {
				mask[i] = ' ';
			} else {
				mask[i] = '_';
			}
		}
		return mask;
	}

	private static String generateRiddle() {
		String[] words = { "árvíztűrő tükörfúrógép", "Bőszájú körülíróművész", "Gyümölcsvédő ágyúfűnyíró",
				"Nyúlfülvágó térközsűrítő", "Túlkábító műrémölőfül", "Zártkörű nőújító ülés", "Üldögélő műújságíró",
				"Új füvön csábító kéjnőt gyűr", "Tüskéshátú kígyóbűvölő", "Tíz büdös légy húsz műcsótányt főz" };
		Random random = new Random();
		int randomIndex = random.nextInt(words.length);
		return words[randomIndex].toUpperCase();
	}

}