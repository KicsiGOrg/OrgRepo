import java.util.Scanner;

public class Easter {

	public static void main(String[] args) {
		String yes = "Igen";
		String no = "Nem";

		for (int i = 0; i <= args.length - 1; i++) {
			System.out.println(args[i]);
		}
		System.out.print("\nZöld erdõben jártam, \n" + "kék ibolyát láttam, \n" + "el akart hervadni, \n" + "Szabad-e locsólni?");
		System.out.print("\nKérem írja ide a választ (Igen vagy Nem): ");
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		if (result.equals(yes)) {
			System.out.println("Sajnos nem hoztam kölnit :(");
		} else if (result.equals(no)) {
			System.out.println("Sebaj, amúgy se hoztam kölnit :)");
		} else if (!result.equals(yes) || !result.equals(no)) {
			System.out.println("Nem jó a válasz! Kérem figyeljen a Case sensitive-itásra :)");
		}
		sc.close();
	}
}
