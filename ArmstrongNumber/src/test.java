public class test {
	static long nSum;
	static long nDigits;
	static long number;
	static int nSumLength;
	static long nSumSum;
	public static void main(String[] args) {
		long number = 4498128791164624869L;
		nDigits = number;
		int length = (int) (Math.log10(number) + 1);
			long nLastDigit = (long) nDigits % 10;
			long j = 0;
			nDigits = j;
			if (j == 0) {
			} else {
				length = (int) (Math.log10(j) + 1);
				for (int i = 0; i < length; i++) {
					nLastDigit = (long) nDigits % 10;
					nDigits = nDigits / 10;
					nSum = nSum + (long) Math.pow(nLastDigit, length);
				}
				if (nSum == j) {
					System.out.println(" - Armstong szám: " + (long)nSum);
				}
				nSum = 0;
			}
			j++;
			
			
			
		if (nSumSum == number) {
			System.out.println("Armstong szám: " + (long) nSum);
		}else {
			System.out.println("Hiba van a számolásban.");
		}
	}
}