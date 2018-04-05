import java.util.Scanner;

public class LeapYear {

	static Scanner sc;
	static boolean leap;

	public static void main(String[] args) {

		welcome();
		do {
			int year = getYear();
			leapValidator(year);
		} while (leap != true);
		System.out.println("\nKöszönöm, hogy igénybe vette a szolgáltatásaimat.");
		sc.close();
	}

	private static int getYear() {
		System.out.print("\nKérem adjon meg egy évszámot: ");
		sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.nextLine();
		return year;
	}

	private static void welcome() {
		System.out.print(
				"Üdvözlöm én a számítógép vagyok.\n"+
				"A mostani programban azt fogom megvizsgálni, hogy az Ön által megadott évszám szökőév-e?"+
				"\nA program addig fog futni, amíg nem találunk szökőévet.\n");
	}

	private static void leapValidator(int year) {
		if (year >= 1582) { 
			if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + " szökőév.");
				leap = true;
			}
			else {
				System.out.println(year + " nem szökőév.");
				leap = false;
			}
		} else {
			System.out.println("1582 előtt nem értelmezett a szökőév fogalma!");
		}
	}
}