import java.util.Scanner;

public class ArmstrongNumber {
	static Scanner sc;
	static long nSum;
	static long nDigits;
	static long nLastDigitPow;
	static int n;
	static int length;
	static int piece = 1;
	static int nOriginal;
	static long i;

	public static void main(String[] args) {

		getN();
		
		long startTime = System.nanoTime();
		nOriginal = n;
		long j = 0;
		do {
			nDigits = j;
			if (j == 0) {
				System.out.println(piece + " - Armstong szám: " + (long) nSum);
				piece++;
			} else {
				length = (int) (Math.log10(j) + 1);
				for (i = 0; i < length; i++) {
					long nLastDigit = (long) nDigits % 10;
					nDigits = nDigits / 10;
					pow(nLastDigit, length);
					nSum = nSum + nLastDigitPow;
					nLastDigitPow = 0;
				}
				if (nSum == j) {
					System.out.println(piece + " - Armstong szám: " + (long) nSum);
					piece++;
				}
				nSum = 0;
			}
			j++;
		} while (piece <= nOriginal);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double seconds = (double)totalTime / 1000000000.0;
		System.out.println(seconds);
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

	private static long pow(long nLastDigit, int length) {
		int numberOfPows = 0;
		if (length == 1) {
			switch ((int) nLastDigit) {
			case 1:
				numberOfPows++;
				return nLastDigitPow = 1;
			case 2:
				numberOfPows++;
				return nLastDigitPow = 2;
			case 3:
				numberOfPows++;
				return nLastDigitPow = 3;
			case 4:
				numberOfPows++;
				return nLastDigitPow = 4;
			case 5:
				numberOfPows++;
				return nLastDigitPow = 5;
			case 6:
				numberOfPows++;
				return nLastDigitPow = 6;
			case 7:
				numberOfPows++;
				return nLastDigitPow = 7;
			case 8:
				numberOfPows++;
				return nLastDigitPow = 8;
			case 9:
				numberOfPows++;
				return nLastDigitPow = 9;
			}
		}
		if (numberOfPows == 0) {
			nLastDigitPow = nLastDigit * nLastDigit;
			numberOfPows++;
		}
		do {
			nLastDigitPow = nLastDigitPow * nLastDigit;
			numberOfPows++;
		} while (numberOfPows < length - 1);
		return nLastDigitPow;
	}
}