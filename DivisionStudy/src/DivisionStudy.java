import java.util.Scanner;
import java.util.stream.IntStream;

public class DivisionStudy {

	static boolean noDivisor = true;

	public static void main(String[] args) {

		System.out.print("Kérem adjon meg egy számot: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine();

		if (number < 0) {
			System.out.println("Hiba! A megadott szám negatív előjelű!");
		} else {
			if (divisorTwo(number)) {
				System.out.println("A szám osztható 2-vel!");
			}

			if (divisorThree(number)) {
				System.out.println("A szám osztható 3-mal!");
			}

			if (divisorFour(number)) {
				System.out.println("A szám osztható 4-gyel!");
			}

			if (divisorFive(number)) {
				System.out.println("A szám osztható 5-tel!");
			}

			if (divisorSix(number)) {
				System.out.println("A szám osztható 6-tal!");
			}

			if (divisorSeven(number)) {
				System.out.println("A szám osztható 7-tel!");
			}

			if (divisorEight(number)) {
				System.out.println("A szám osztható 8-cal!");
			}

			if (divisorNine(number)) {
				System.out.println("A szám osztható 9-cel!");
			}

			if (divisorTen(number)) {
				System.out.println("A szám osztható 10-zel!");
			}
			if (noDivisor) {
				System.out.println("A megadott számnak nincs 2 és 10 közötti osztója!");
			}
		}
		scanner.close();
	}

	private static boolean divisorTwo(int number) {
		int lastDigit = Math.abs(number - ((int) (number / 10)) * 10);
		if (lastDigit == 0 || lastDigit == 2 || lastDigit == 4 || lastDigit == 6 || lastDigit == 8) {
			noDivisor = false;
			return true;
		}
		return false;
	}

	private static boolean divisorThree(int number) {
		String strNumber = String.valueOf(number);
		int[] array = new int[strNumber.length()];
		int subtrahend = 3;

		arrayExaminer(strNumber, array);

		int sumNumber = IntStream.of(array).sum();
		int xyz = sumNumber - subtrahend;
		if (sumNumber == subtrahend) {
			noDivisor = false;
			return true;
		} else {
			for (int f = 0; xyz >= 0; f++) {
				xyz = xyz - subtrahend;
				if (xyz == 0) {
					noDivisor = false;
					return true;
				}
			}
		}
		return false;
	}

	private static boolean divisorFour(int number) {
		String[] fourArray = { "00", "04", "08", "12", "16", "20", "24", "28", "32", "36", "40", "44", "48", "52", "56",
				"60", "64", "68", "72", "76", "80", "84", "88", "92", "96" };

		String strNumber = String.valueOf(number);
		if (strNumber.length() == 1) {
			strNumber = "0" + strNumber;
		}
		if (strNumber.length() > 2) {
			strNumber = strNumber.substring(strNumber.length() - 2, strNumber.length());
		}

		for (int i = 0; i < fourArray.length; i++) {
			if (strNumber.equals(fourArray[i])) {
				noDivisor = false;
				return true;
			}
		}
		return false;
	}

	private static boolean divisorFive(int number) {
		int lastDigit = Math.abs(number - ((int) (number / 10)) * 10);
		if (lastDigit == 0 || lastDigit == 5) {
			noDivisor = false;
			return true;
		}
		return false;
	}

	private static boolean divisorSix(int number) {
		if (divisorTwo(number) && divisorThree(number)) {
			return true;
		}
		return false;
	}

	private static boolean divisorSeven(int number) {

		String strNumber = String.valueOf(number);
		
		strNumber = stringFiller(strNumber);

		int xyz;
		int[] sevenArray = new int[4];

		fillArray(strNumber, sevenArray);

		int sumNumber = IntStream.of(sevenArray).sum();
		if (sumNumber < 0) {
			sumNumber = sumNumber * -1;
		}
		int subtrahend = 7;
		return divisorTester(sumNumber, subtrahend);
	}

	private static boolean divisorEight(int number) {

		String strNumber = String.valueOf(number);
		int lastDigits = 0;
		strNumber = stringFiller(strNumber); 
		strNumber = strNumber.substring(strNumber.length() - 3, strNumber.length());
		lastDigits = Integer.parseInt(strNumber);
		int subtrahend = 8;
		
		return divisorTester(lastDigits, subtrahend);
	}

	private static boolean divisorNine(int number) {
		String strNumber = String.valueOf(number);
		int[] array = new int[strNumber.length()];
		int subtrahend = 9;

		arrayExaminer(strNumber, array);

		int xyz;
		int sumNumber = IntStream.of(array).sum();
		xyz = sumNumber - subtrahend;
		if (sumNumber == subtrahend) {
			noDivisor = false;
			return true;
		} else {
			for (int f = 0; xyz >= 0; f++) {
				xyz = xyz - subtrahend;
				if (xyz == 0) {
					noDivisor = false;
					return true;
				}
			}
		}
		return false;
	}

	private static boolean divisorTen(int number) {
		int lastDigit = Math.abs(number - ((int) (number / 10)) * 10);
		if (lastDigit == 0) {
			noDivisor = false;
			return true;
		}
		return false;
	}

	private static boolean divisorTester(int lastDigits, int subtrahend) {
		int xyz = lastDigits - subtrahend;
		if (lastDigits == subtrahend) {
			noDivisor = false;
			return true;
		} else {
			for (int f = 0; xyz >= 0; f++) {
				xyz = xyz - subtrahend;
				if (xyz == 0) {
					noDivisor = false;
					return true;
				}
			}
		}
		return false;
	}
	
	private static String stringFiller(String strNumber) {
		int width = 12;
		char fill = '0'; 

		strNumber = new String(new char[width - strNumber.length()]).replace('\0', fill) + strNumber;
		return strNumber;
	}
	
	private static void arrayExaminer(String strNumber, int[] array) {
		String strNumberIndex;
		int numberIndex;
		int i = 1;
		int j = 0;
		int k = 0;
		while (i <= strNumber.length()) {
			strNumberIndex = strNumber.substring(strNumber.length() - i, strNumber.length() - j);
			i++;
			j++;
			numberIndex = Integer.parseInt(strNumberIndex);
			array[k] = numberIndex;
			k++;
		}
	}

	private static void fillArray(String strNumber, int[] sevenArray) {
		int beginIndexNumber = 3;
		int endIndexNumber = 0;
		int multiplier;

		for (int i = 0; i < 4; i++) {
			if (i == 0 || i == 2) {
				multiplier = +1;
			} else {
				multiplier = -1;
			}
			String strFourthThreeDigits = strNumber.substring(strNumber.length() - beginIndexNumber,
					strNumber.length() - endIndexNumber);
			int intFourthThreeDigits = Integer.parseInt(strFourthThreeDigits);
			sevenArray[i] = intFourthThreeDigits * multiplier;
			beginIndexNumber += 3;
			endIndexNumber += 3;
		}
	}
}