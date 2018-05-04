import java.util.Scanner;

public class Sorting {

	public static void sorting(Scanner sc) {
		int userInput = GetInput.getInput(sc);
		int[] arrayOne = CreateAnArray.createAnArray(userInput);
		int[] arrayTwo = CreateAnArray.createAnArray(userInput);
		int[] arrayThree = CreateAnArray.createAnArray(userInput);
		arrayOne = CreateAnArray.fillArray(userInput);
		PrintArray.printArray("A generált tömb elemei: ", arrayOne);
		sorting(arrayOne, arrayTwo, arrayThree);
		PrintArray.printArray("\nPáros számok: ", arrayTwo);
		PrintArray.printArray("\nPárat számok: ", arrayThree);
	}

	private static void sorting(int[] arrayOne, int[] arrayTwo, int[] arrayThree) {
		for (int i = 0; i < arrayOne.length; i++) {
			if (arrayOne[i] % 2 == 0) {
				arrayTwo[i] = arrayOne[i];
			} else {
				arrayThree[i] = arrayOne[i];
			}
		}
	}
}
