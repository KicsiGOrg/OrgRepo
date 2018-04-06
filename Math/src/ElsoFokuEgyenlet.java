import java.util.HashMap;
import java.util.Scanner;

public class ElsoFokuEgyenlet {

	static Scanner sc;
	static int number;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Integer>();
		int f = 1;
		System.out.println("A mostani program kiszámolja az Elsõ fokú egyenlet eredményét.\n");
		
		for(int i = 0; i < 2; i++) {
			System.out.print("Kérem adja meg az " + f + " számot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
			if (equationOfValues.get('a') == 0) {
				System.out.println("0-val Tilos osztani");
				character--;
				i--;
				f--;
			}
		}
		double x = -equationOfValues.get('b') / equationOfValues.get('a');
		if (equationOfValues.get('a') * x + equationOfValues.get('b') == 0) {
			System.out.println(x + " = " + "-" + equationOfValues.get('b') + " / " + equationOfValues.get('a'));
			System.out.println("Az X = " + x);
		} else {
			System.out.println(x + " = " + "-" + equationOfValues.get('b') + " / " + equationOfValues.get('a'));
			System.out.println("Az X = " + x);
		}
		sc.close();
	}
}
