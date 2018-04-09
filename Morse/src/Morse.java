import java.util.HashMap;
import java.util.Scanner;

public class Morse {

	static String input;
	static HashMap<String, String> setOfValues;
	static Scanner sc;
	
	public static void main(String[] args) {

		setHashMapValues();
		getInput();
		String[] inputArray = new String[input.length()];
		addInputToArray(inputArray);
		morseToConsole(inputArray);
		sc.close();
	}

	private static void getInput() {
		System.out.print("Kérem adja meg a fordítandó szöveget: ");
		sc = new Scanner(System.in);
		input = sc.nextLine();
	}

	private static void morseToConsole(String[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(setOfValues.get(inputArray[i]));
		}
	}

	private static void addInputToArray(String[] inputArray) {
		int f = 1;
		for (int i = 0; i < input.length(); i++) {
			String strChar = input.substring(i, f);
			inputArray[i] = strChar.toUpperCase();
			f++;
		}
	}

	private static void setHashMapValues() {
		setOfValues = new HashMap<String, String>();
		
		setOfValues.put("A",".-   ");
		setOfValues.put("�",".--.-   ");
		setOfValues.put("B","-...   ");
		setOfValues.put("C","-.-.   ");
		setOfValues.put("D","-..   ");
		setOfValues.put("E",".   ");
		setOfValues.put("�","..-..   ");
		setOfValues.put("F","..-.   ");
		setOfValues.put("G","--.   ");
		setOfValues.put("H","....   ");
		setOfValues.put("I","..   ");
		setOfValues.put("�","..   ");
		setOfValues.put("J",".---   ");
		setOfValues.put("K","-.-   ");
		setOfValues.put("L","--..   ");
		setOfValues.put("M","--   ");
		setOfValues.put("N","-.   ");
		setOfValues.put("O","---   ");
		setOfValues.put("�","---.   ");
		setOfValues.put("�","---.   ");
		setOfValues.put("P",".--.   ");
		setOfValues.put("Q","--.-   ");
		setOfValues.put("R",".-.   ");
		setOfValues.put("S","...   ");
		setOfValues.put("T","-   ");
		setOfValues.put("U","..-   ");
		setOfValues.put("�","..-   ");
		setOfValues.put("�","..--   ");
		setOfValues.put("�","..--   ");
		setOfValues.put("V","...-   ");
		setOfValues.put("W",".--   ");
		setOfValues.put("X","-..-   ");
		setOfValues.put("Y","-.--   ");
		setOfValues.put("Z","--..   ");
		setOfValues.put("1",".----   ");
		setOfValues.put("2","..---   ");
		setOfValues.put("3","...--   ");
		setOfValues.put("4","....-   ");
		setOfValues.put("5",".....   ");
		setOfValues.put("6","-....   ");
		setOfValues.put("7","--...   ");
		setOfValues.put("8","---..   ");
		setOfValues.put("9","----.   ");
		setOfValues.put("0","-----   ");
		setOfValues.put(" ","___ ");
		setOfValues.put("!","--.--   ");
		setOfValues.put(",","--..--   ");
		setOfValues.put(".",".-.-.-   ");
		setOfValues.put("/","-..-.   ");
		setOfValues.put(":","---...   ");
		setOfValues.put(";","-.-.-.   ");
		setOfValues.put("=","-...-   ");
		setOfValues.put("?","..--..   ");
		setOfValues.put("@",".--.-.   ");
		setOfValues.put("_","..--.-   ");
		setOfValues.put("*","-..-   ");
		setOfValues.put("+",".-.-.   ");
		setOfValues.put("-","-...-   ");
		setOfValues.put("(","-.--.   ");
		setOfValues.put(")","-.--.-   ");
		setOfValues.put("'",".----.   ");
		setOfValues.put("\"",".-..-.   ");
	}

}
