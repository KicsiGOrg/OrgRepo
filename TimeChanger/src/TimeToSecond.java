import java.util.Scanner;

public class TimeToSecond {
	static Scanner sc = new Scanner(System.in);
	static int second;
	static int minute;
	static int hour;

	static int time(int hour, int minute, int second) {
		return hour * 3600 + minute * 60 + second;
	}

	public static void main(String[] args) {

		getHour();
		getMinute();
		getSecond();
		sc.close();

		System.out.println("\nóra:perc:másodperc -> másodperc\n" + hour + ":" + minute + ":" + second + " = "
				+ time(hour, minute, second) + " másodperc.");
	}

	private static void getHour() {
		do {
			System.out.print("Kérem adja meg a vizsgálandó időt (óra): ");
			hour = sc.nextInt();
			sc.nextLine();
		} while (hour < 0);
	}

	private static void getMinute() {
		do {
			System.out.print("Kérem adja meg a vizsgálandó időt [0 - 60] (perc): ");
			minute = sc.nextInt();
			sc.nextLine();
			if (minute < 0 || minute > 60) {
				System.out.println("A megadott szám érvénytelen.");
			}
		} while (minute < 0);
	}

	private static void getSecond() {
		do {
			System.out.print("Kérem adja meg a vizsgálandó időt [0 - 60] (másodperc): ");
			second = sc.nextInt();
			sc.nextLine();
			if (second < 0 || second > 60) {
				System.out.println("A megadott szám érvénytelen.");
			}
		} while (second < 0 || second > 60);
	}
}