import java.util.HashMap;
import java.util.Scanner;

public class Hanyados {
	
	static Scanner sc;
	static int number;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;
	
	public static void main(String[] args) {
	
		equationOfValues = new HashMap<Character, Integer>();
		int f = 1;
		System.out.println("A mostani program kiszámolja, hogy az elsõ szám osztható-e a második számmal.\n");

		for (int i = 0; i < 2; i++) {
			if(f == 1) {
				System.out.print("Kérem adja meg a számot: ");
			}else {
				System.out.print("Kérem adja meg a hányadost: ");
			}
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
		}
		
		for (int b = 0; b <= equationOfValues.get('b'); b++) {
			long c = (int) Math.pow(equationOfValues.get('a'), b);
			System.out.println(equationOfValues.get('a') + " - " + b + " hatványa: " + c);
		}
		sc.close();
	}
}