import java.util.Arrays;
import java.util.Scanner;

public class Converter {

	public static void binaryToText(Scanner sc) {
		System.out.print("Kérem írja ide a fordítandó Bináris kódot: ");
		String input = sc.nextLine();
		input = input.replaceAll("\\s+","");
		StringBuilder sb = new StringBuilder();
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> sb.append((char) Integer.parseInt(s, 2)));
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> System.out.print((char) Integer.parseInt(s, 2)));
		System.out.println();
	}

	public static void textToBinary(Scanner sc) {
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
