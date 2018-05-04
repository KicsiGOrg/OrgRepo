import java.util.Scanner;

public class Assortment {

	public static void assortment(Scanner sc) {
		int userInput = GetInput.getInput(sc);
		int[] arrayOne = CreateAnArray.createAnArray(userInput);
		int[] arrayTwo = CreateAnArray.createAnArray(userInput);
		arrayOne = CreateAnArray.fillArray(userInput);
		PrintArray.printArray("A generált tömb elemei: ", arrayOne);
		assortment(arrayOne, arrayTwo);
		PrintArray.printArray("\nA tömb 50-nél kisebb elemei: ", arrayTwo);
	}

	private static void assortment(int[] arrayOne, int[] arrayTwo) {
		for (int i = 0; i < arrayOne.length; i++) {
			if (arrayOne[i] < 50) {
				arrayTwo[i] = arrayOne[i];
			}
		}
	}
}
