import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HappyBirthday {

	public static void main(String[] args) {
		// Ma dátum lekrdezése év paraméterre csökkente String formátumban
		DateFormat df = new SimpleDateFormat("yyyy");
		Date today = Calendar.getInstance().getTime();
		String currentYear = df.format(today);

		// String formátumú év paraméter integerré konvertálása
		int intCurrentYear = Integer.parseInt(currentYear);

		// Integer formátumú évszámból kivonjuk a születési évet, hogy megtudjuk az
		// aktuális évszámot
		int birthYear = intCurrentYear - 1955;

		// String-gé visszaalakítva a dátum, hogy a tömbön belül tudjak rá hivatkozni
		String stringBirthYear = String.valueOf(birthYear);

		// Az aktuális évből kivonjuk a Ph.D megszerzésének az évét
		int previousBirthYear = intCurrentYear - 1983;

		String[] datas = { "James", "Gossling", stringBirthYear,
				" születésnapod alkalmából kívánok nagyon boldog születésnapot!",
				" éves korodban szerezted a Ph.D-det a Carnegie Mellon University-n, amihez utólag is gratulálok!",
				"Viszlát! Jövőre Veled ugyanitt" };

		System.out.println("Isten éltessen " + datas[0] + "!");
		System.out.println(stringBirthYear + datas[3]);
		System.out.println(previousBirthYear + datas[4]);
		System.out.println(datas[datas.length - 1]);

	}

}
