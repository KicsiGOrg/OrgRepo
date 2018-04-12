import java.util.Scanner;

public class ArmstrongNumber {

	static Scanner sc;
	static int n;
	static int length;
	static int piece = 1;
	static double nSum = 0;
	static int nOriginal;
	static long i;
	static long nDigits;

	public static void main(String[] args) {

		getN();
		nOriginal = n;
		long j = 0;
		do {
			nDigits = j;
			if (j == 0) {
				System.out.println(piece + " - Armstong szám: " + (long)nSum);
				piece++;
			} else {
				length = (int) (Math.log10(j) + 1);
				for (i = 0; i < length; i++) {
					long nLastDigit = (long) nDigits % 10;
					nDigits = nDigits / 10;
					nSum = nSum + (double) Math.pow(nLastDigit, length);
				}
				if (nSum == j) {
					System.out.println(piece + " - Armstong szám: " + (long)nSum);
					piece++;
				}
				nSum = 0;
			}
			j++;
		} while (piece <= nOriginal);
	}

	private static int getN() {
		sc = new Scanner(System.in);
		System.out.println("Armstrong szám vizsgálat.\nKérem adjon meg egy 1 és 50 közötti számot.");
		do {
			System.out.print("N: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n < 1 || n > 50) {
				System.out.println("A megadott szám érvénytelen. ");
			}
		} while (n > 50 || n < 1);
		sc.close();
		return n;
	}
}
