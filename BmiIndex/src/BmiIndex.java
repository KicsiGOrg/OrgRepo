import java.util.Scanner;

public class BmiIndex {

	static Scanner sc;
	static double bmiIndex;
	static double height;
	static double weight;
	
	public static void main(String[] args) {

		int i = 0;
		System.out.println(
				"A beírt adatok alapján kiszámolom a testtömeg indexét.");
		do {
			if(i == 0) {
				System.out.print("\nKérem adja meg a magasságát: ");
				sc = new Scanner(System.in);
				height = sc.nextInt();
				sc.nextLine();
				height = height / 100;
			}else if(i == 1) {
				System.out.print("\nKérem adja meg a súlyát: ");
				sc = new Scanner(System.in);
				weight = sc.nextInt();
				sc.nextLine();
			}
			i++;
		} while (i != 2);
		sc.close();
		bmiIndex = weight / Math.pow(height, 2);

		if(bmiIndex < 20) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Sovány.");
		}else if(bmiIndex < 25 && bmiIndex > 20) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Átlagos.");
		}else if(bmiIndex < 30 && bmiIndex > 25) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Túlsúlyos.");
		}else if(bmiIndex < 40 && bmiIndex > 30) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Elhízott.");
		}else if(bmiIndex > 40) {
			System.out.println("\nA megadott értékek alapján, az ön testtömeg index besorolása: Kórosan elhízott.");
		}
		
	}
}