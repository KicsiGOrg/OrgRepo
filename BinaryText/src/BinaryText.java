import java.util.Arrays;
import java.util.Scanner;

public class BinaryText {

	static int menuNumber;
	static Scanner sc;

	public static void main(String[] args) {

		greetingAndMenu();
		do {
			System.out.print("\nKérem válasszon a menüből: ");
			sc = new Scanner(System.in);
			menuNumber = sc.nextInt();
			sc.nextLine();

			switch (menuNumber) {
			case 1:
				textToBinary();
				break;
			case 2:
				binaryToText();
				break;
			case 3:
				System.out.println("\nKöszönöm, hogy igénybe vette a szolgálataimat :) " + "\nViszontlátásra!");
				break;
			default:
				System.out.println("Hibás menüpont");
				break;
			}
		} while (menuNumber != 3);
		sc.close();
	}

	private static void binaryToText() {
		System.out.print("Kérem írja ide a fordítandó Bináris kódot: ");
		String input = sc.nextLine();
		//sc.nextLine();
		input = input.replaceAll("\\s+","");
		StringBuilder sb = new StringBuilder();
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> sb.append((char) Integer.parseInt(s, 2)));
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> System.out.print((char) Integer.parseInt(s, 2)));
		System.out.println();
	}

	private static void greetingAndMenu() {
		System.out.println("Üdvözlöm én a fordító vagyok!\nOlvasható formátumot fordítok át Bináris nyelvre vagy fordítva.\n");
		System.out.println("               MENÜSOR\n" + "**********************************\n" + "1 - Szöveg fordítása bináris kódra\n" + "2 - Bináris kód fordítása szövegre\n" + "3 - Kilépés");
	}

	private static void textToBinary() {
		System.out.println("Szöveg fordítása bináris kódra.");
		System.out.print("Kérem írja ide a fordítandó szöveget: ");
		String s = sc.nextLine();

		byte[] bytes = s.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println("'" + s + "' to binary: " + binary);
	}

}
