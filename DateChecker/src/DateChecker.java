import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * A program célja, hogy egy adott év adott hónapjának visszaadja a hétfői és a vasárnapi napok dátumát.
 */

public class DateChecker {

	static Scanner sc;
	static int year;
	static int week;
	
	public static void main(String[] args) {
		getDatas();
		outputInformation();
	}

	private static void outputInformation() {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setWeekDate(year, week, Calendar.MONDAY);  														//A hét napjának megadásával lehet megadni, hogy a rendszer melyik napot vizsgálja.
		System.out.println(year + " " + week + ". hetének hétfője = " + gc.get(Calendar.DAY_OF_MONTH));
		gc.setWeekDate(year, week, Calendar.SUNDAY);														//A hét napjának megadásával lehet megadni, hogy a rendszer melyik napot vizsgálja.
		System.out.println(year + " " + week + ". hetének vasárnapja = " + gc.get(Calendar.DAY_OF_MONTH));
	}

	private static void getDatas() {
		sc = new Scanner(System.in);
		System.out.print("Kérem adja meg az évszámot: ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("Kérem adja meg a hetet: ");
		week = sc.nextInt();
		sc.nextLine();
		sc.close();
	}
}