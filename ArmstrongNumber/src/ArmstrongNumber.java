import java.util.Scanner;

public class ArmstrongNumber {

	static Scanner sc;
	static long n;
	static int length;
	static int piece = 0;
	static long i = 0;
	static long number;
	
	public static void main(String[] args) {

		long max = Long.MAX_VALUE;

		sc = new Scanner(System.in);
		System.out.println("Armstrong szám vizsgálat.\nKérem adjon meg egy 1 és 50 közötti számot");
		do {
			System.out.print("N: ");
			n = sc.nextLong();
			sc.nextLine();
			if (n < 1 || n > 50) {
				System.out.println("A megadott szám érvénytelen. ");
			}
		} while (n > 50 || n < 1);
		sc.close();
//		do {
		
		/*
		 * A feladat az i növelése, amíg a program ki nem számolja az n-edik Armstrong számot.
		 * Az i hosszával hatványozni kell az i számegyeit és azokat összeadva ellenőrizni kell, h megegyezik-e az eredeti i-vel
		 * Ha megeyezik, akkor az i Armstrong szám akkor azt ki kell írni és a piece értéken növelni
		 * Ha nem egyezik meg, akkor nem írjuk ki és nem növeljük a piece-t.
		 */
			length = (int) (Math.log10(n) + 1);
			System.out.println("length: " + length);
			System.out.println("lastDigit " +  n % 10);
			n = n / 10;
			System.out.println("n: " + n);
			/*
			if (0 == 0) {
				System.out.println();
				piece++;
			}
			*/
			i++;
	//	} while (piece > n);
	}
}
