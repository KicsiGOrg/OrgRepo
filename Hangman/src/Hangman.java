import java.util.Random;
import java.util.Scanner;

/**
 * Implementation of the Hangman game.
 */
public class Hangman {

	/**
	 * Program entry point.
	 *
	 * @param args
	 *            Command line arguments.
	 */
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
		scanner.close();
	}

	/**
	 * This method prints out the wrong letters guessed so far to the standard
	 * output.
	 *
	 * @param wrongGuesses
	 *            The wrong guesses to print.
	 * @param numberOfWrongGuesses
	 *            The number of wrong guesses.
	 */
	private static void printWrongLetters(char[] wrongGuesses, int numberOfWrongGuesses) {
		System.out.format("Nincs benne ez a(z) %d betű: ", numberOfWrongGuesses);
		String separator = "";
		for (int i = 0; i < numberOfWrongGuesses; i++) {
			System.out.print(separator + wrongGuesses[i]);
			separator = ", ";
		}
		System.out.println();
	}

	/**
	 * Checked if the solution is complete.
	 *
	 * @param solution
	 *            The solution to check.
	 * @return True if the solution does not contain any underscore characters,
	 *         false otherwise.
	 */
	private static boolean isSolved(char[] solution) {
		for (int i = 0; i < solution.length; i++) {
			if (solution[i] == '_') {
				return false;
			}
		}
		return true;
	}

	/**
	 * Update the solution by looking at the currently guessed letter.
	 *
	 * @param riddleWord
	 *            The word we need to guess.
	 * @param solution
	 *            The solution so far.
	 * @param guessedLetter
	 *            The letter the user guessed.
	 * @return True if the letter was found in the riddle word, false otherwise.
	 */
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

	/**
	 * Reads the next letter from the user.
	 *
	 * @param scanner
	 *            The scanner to use for the reading.
	 * @param askMessage
	 *            The ask message to display on the standard output prior to reading
	 *            it from the user.
	 * @return The read letter.
	 */
	private static char readUserInput(Scanner scanner, String askMessage) {
		System.out.print(askMessage);
		String word = scanner.nextLine();
		String upperCaseWord = word.toUpperCase();
		char firstLetter = upperCaseWord.charAt(0);
		return firstLetter;
	}

	/**
	 * Prints the specified riddle.
	 *
	 * @param solution
	 *            The solution to print to the standard output.
	 */
	private static void printRiddle(char[] solution) {
		for (char c : solution) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	/**
	 * This method generated the masked version of the riddle word.
	 *
	 * @param riddleWord
	 *            The riddle word to generate the masked version for.
	 * @return The masked version.
	 */
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

	/**
	 * This method generates the riddle word that the user will have to guess.
	 *
	 * @return The randomly chosen word.
	 */
	private static String generateRiddle() {
		String[] words = { "árvíztűrő tükörfúrógép", "Bőszájú körülíróművész", "Gyümölcsvédő ágyúfűnyíró",
				"Nyúlfülvágó térközsűrítő", "Túlkábító műrémölőfül", "Zártkörű nőújító ülés", "Üldögélő műújságíró",
				"Új füvön csábító kéjnőt gyűr", "Tüskéshátú kígyóbűvölő", "Tíz büdös légy húsz műcsótányt főz" };
		Random random = new Random();
		int randomIndex = random.nextInt(words.length);
		return words[randomIndex].toUpperCase();
	}

}