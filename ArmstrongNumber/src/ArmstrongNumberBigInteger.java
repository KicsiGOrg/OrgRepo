import java.math.BigInteger;
import java.util.Scanner;

public class ArmstrongNumberBigInteger {
	static Scanner sc;
	static BigInteger nSum = BigInteger.valueOf(0);
	static BigInteger nDigits;
	static BigInteger nLastDigitPow;
	static int n;
	static int length;
	static int piece = 1;
	static int nOriginal;
	static long i;
	static BigInteger divisor = BigInteger.valueOf(10);

	public static void main(String[] args) {

		getN();
		
		nOriginal = n;
		long j = 0;
		do {
			nDigits = BigInteger.valueOf(j);
			if (j == 0) {
				System.out.println(piece + " - Armstong szám: 0");
				piece++;
			} else {
				length = (int) (Math.log10(j) + 1);
				for (i = 0; i < length; i++) {
					BigInteger nLastDigit =  nDigits.remainder(divisor);
					nDigits = nDigits.divide(divisor);
					nLastDigitPow = nLastDigit.pow(length);
					nSum = nSum.add(nLastDigitPow);
					nLastDigitPow = BigInteger.valueOf(0);
				}
				if (nSum == BigInteger.valueOf(j)) {
					System.out.println(piece + " - Armstong szám: " + nSum);
					piece++;
				}
				nSum = BigInteger.valueOf(0);
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