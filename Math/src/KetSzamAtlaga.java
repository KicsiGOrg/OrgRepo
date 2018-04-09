import java.util.HashMap;
import java.util.Scanner;

public class KetSzamAtlaga {

	static Scanner sc;
	static double number;
	static char character = 'a';
	static HashMap<Character, Double> equationOfValues;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Double>();
		int f = 1;
		System.out.println("A mostani program kiszámolja, hogy az első szám osztható-e a második számmal.\n");

		for (int i = 0; i < 2; i++) {
			System.out.print("Kérem adja meg a(z) " + f + " számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
		}
		double atlag = (equationOfValues.get('a') + equationOfValues.get('b')) / 2;
		System.out.println(equationOfValues.get('a') + " és " + equationOfValues.get('b') +" átlaga = " + atlag);
	}
}