import java.util.Scanner;

public class SecondToTime {

	static int second;

	static void time(int mp) {
		int second = mp;
		int hour = second / 3600;
		second %= 3600;
		int minute = second / 60;
		second %= 60;
		System.out.println(mp + " másodperc -> óra:perc:másodperc = " + hour + ":" + minute + ":" + second);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getSecond(sc);
		sc.close();
		time(second);
	}

	private static void getSecond(Scanner sc) {

		do {
			try {
				System.out.print("Kérem adja meg a vizsgálandó időt másodpercben: ");
				second = sc.nextInt();
				sc.nextLine();
				if (second <= 0) {
					System.out.println("A megadott szám túl kicsi, 0-nál nagyobb számot adjon meg.");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Nana Balázs!\nNem garázdálkodunk a programban oda nem illő dolgokkal :)\n");
			}
		} while (second <= 0);
	}
}