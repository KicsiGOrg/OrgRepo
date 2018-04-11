import java.util.Scanner;

public class ArmstrongNumber {

	static Scanner sc;
	static int n;
	static int length;
	static int piece = 1;
	static long nSum = 0;
	static int nOriginal;
	static int i;
	
	public static void main(String[] args) {

		getN();
		int nDigits = n;
		for(int j = 0; j < n; j++) {
//			length = (int) (Math.log10(n) + 1);
			length = (int) (Math.log10(j) + 1);
			for (i = 0; i < length; i++) {
				int nLastDigit = nDigits % 10;
				int nPowDigit = (int) Math.pow(nLastDigit, length);
				nDigits = j / 10;
				nSum = nSum + nPowDigit;
			}
			if (nSum == i) {
				System.out.println(piece + " - Armstong szám: " + nSum);
				piece++;
				if(n == 0) {
					n++;
				}else {
					n++;
				}
			}
		} 
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
