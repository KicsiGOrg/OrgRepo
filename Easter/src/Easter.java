import java.util.Scanner;

public class Easter {

	static Scanner sc;
	static String result;
	
	public static void main(String[] args) {
		String yes = "IGEN";
		String no = "NEM";

		for (int i = 0; i <= args.length - 1; i++) {
			System.out.println(args[i]);
		}
		System.out.print("\nZöld erdőben jártam, \n" + "Kék ibolyát láttam, \n" + "El akart hervadni, \n" + "Szabad-e locsolni?\n");
		do {
			System.out.print("\nKérem írja ide a választ (Igen vagy Nem): ");
			sc = new Scanner(System.in);
			result =  sc.nextLine();
			result = result.toUpperCase();
			if (result.equals(yes)) {
				System.out.println("\nSajnos nem hoztam kölnit :(");
			} else if (result.equals(no)) {
				System.out.println("\nSebaj, amúgy se hoztam kölnit :)");
			} else if (!result.equals(yes) || !result.equals(no)) {
				System.out.println("\nHelytelen input!");
			}
		}while(!result.equals(yes) && !result.equals(no));
		sc.close();
	}
}