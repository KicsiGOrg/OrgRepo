
public class Evaluation {

	public static void evaluation(double bmiIndex, double weight, double height) {
		bmiIndex = weight / Math.pow(height, 2);
		if (bmiIndex < 20) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Sovány.");
		} else if (bmiIndex < 25 && bmiIndex > 20) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Átlagos.");
		} else if (bmiIndex < 30 && bmiIndex > 25) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Túlsúlyos.");
		} else if (bmiIndex < 40 && bmiIndex > 30) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Elhízott.");
		} else if (bmiIndex > 40) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Kórosan elhízott.");
		}
	}

}
