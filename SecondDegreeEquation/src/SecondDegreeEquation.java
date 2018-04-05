import java.util.HashMap;
import java.util.Scanner;

public class SecondDegreeEquation {

	static Scanner sc;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;
	static double xOne;
	static double xTwo;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Integer>();
		System.out.println("A mostani program célja meghatározni a \"ax2 + bx + c=0\" képlet valós gyökeit.\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("Kérem adja meg a képlet \"" + character + "\" értékét: ");
			sc = new Scanner(System.in);
			int number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
		}

		double discriminant = Math.sqrt(
				Math.pow((equationOfValues.get('b')), 2) - (4 * equationOfValues.get('a') * equationOfValues.get('c')));

		if (discriminant > 0) {
			xOne = (-equationOfValues.get('b') + discriminant) / (2 * equationOfValues.get('a'));
			xTwo = (-equationOfValues.get('b') - discriminant) / (2 * equationOfValues.get('a'));
			System.out.println("\nAz egyenlet gyökei: " + xOne + " és " + xTwo);
		} else if (discriminant == 0) {
			xOne = -equationOfValues.get('b') / (2 * equationOfValues.get('a'));
			System.out.println("\nAz egyenlet gyöke: " + xOne);
		} else {
			System.out.println("\nA Diszkrimináns negatív, tehát a képletnek nincs valós megoldása.");
		}

		sc.close();
	}
}