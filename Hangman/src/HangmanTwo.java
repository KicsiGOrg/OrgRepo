import java.util.Random;
import java.util.Scanner;

/*
 * Hangman
 * Feladványok - KÉSZ
 * Feladvány random kiválasztása, visszaadása uppercase-elve - KÉSZ
 * Feladvány karakterekre bontása és tárolása '_' és ' ' karakterekben - KÉSZ (char[]-ben tároljuk le! )
 * Feladványok megjelnítése - KÉSZ (char[]-t adunk át nincs visszatérési érték, csak print, ami foreach-el végig iterál a betűkön és azokat kiírja egy sorba karakterenként + ' ', majd a végén egy plusz sortörés!)
 * Input bekérés
 * Input ellenőrzése a feladványban, amennyiben talál a hozzátartozó '_' jelet írja felül a betűvel
 * Hiba esetén írja ki a hibás betűt, ami nem szerepel a feladványban
 * 10 hibázási / idő előtti megfejtésre vizsgálat
 */

public class HangmanTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String riddle = getRiddle();
		System.out.println(riddle); // a program végén törölni
		char[] maskedRiddle = maskedSolution(riddle);
		char[] wrongLetters = new char[10];
		int mistakes = 0;
		boolean solution = false;
		do {
			printMaskedRiddle(maskedRiddle);
			String input = sc.nextLine();
		}
		while(mistakes != 10 || solution != true);
		sc.close();
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
	
}
