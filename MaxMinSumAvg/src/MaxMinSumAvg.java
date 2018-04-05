import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxMinSumAvg {

	public static void main(String[] args) {
		
		int numberIndex = 1;
		int[] numberArray = new int[10];
		Scanner sc = new Scanner(System.in);
		int max = numberArray[0];
		
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Kérem adja meg a(z) " + numberIndex + " vizsgálandó számot: ");
			int inputNumber = sc.nextInt();
			sc.nextLine();
			numberIndex++;
			numberArray[i] = inputNumber;
		}

		int sumNumber = IntStream.of(numberArray).sum();


		for (int i = 0; i <= numberArray.length - 1; i++) {
			if (numberArray[i] > max) {
				max = numberArray[i];
			}
		}

		int min = max;
		for (int i = 0; i <= numberArray.length - 1; i++) {
			if (numberArray[i] < min) {
				min = numberArray[i];
			}
		}

		System.out.println("A tömb minimuma: " + min);
		System.out.println("A tömb maximuma: " + max);
		System.out.println("A tömb összege: " + sumNumber);
		System.out.println("A tömb átlaga: " + Math.round(sumNumber / numberArray.length));

		sc.close();

	}
}