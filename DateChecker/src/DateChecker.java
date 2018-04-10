import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * A program célja, hogy egy adott év adott hónapjának visszaadja a hétfői és a vasárnapi napok dátumát.
 */

public class DateChecker {

	static Scanner sc;
	static int year;
	static int month;
	
	public static void main(String[] args) {
		getDatas();
		outputInformation();
	}

	private static void outputInformation() {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setWeekDate(year, month, Calendar.MONDAY);  														//A hét napjának megadásával lehet megadni, hogy a rendszer melyik napot vizsgálja.
		System.out.println(year + " " + month + ". hetének hétfője = " + gc.get(Calendar.DAY_OF_MONTH));
		gc.setWeekDate(year, month, Calendar.SUNDAY);														//A hét napjának megadásával lehet megadni, hogy a rendszer melyik napot vizsgálja.
		System.out.println(year + " " + month + ". hetének vasárnapja = " + gc.get(Calendar.DAY_OF_MONTH));
	}

	private static void getDatas() {
		sc = new Scanner(System.in);
		System.out.print("Kérem adja meg az évszámot: ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("Kérem adja meg a hónapot: ");
		month = sc.nextInt();
		sc.nextLine();
		sc.close();
	}
}