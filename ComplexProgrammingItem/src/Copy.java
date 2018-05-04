import java.util.Scanner;

public class Copy {

	public static void arrayCopy(Scanner sc) {
		int userInput = GetInput.getInput(sc);
		int[] arrayOne = CreateAnArray.createAnArray(userInput);
		int[] arrayTwo = CreateAnArray.createAnArray(userInput);
		arrayOne = CreateAnArray.fillArray(userInput);
		PrintArray.printArray("A generált tömb elemei: ", arrayOne);
		copy(arrayOne, arrayTwo);
		PrintArray.printArray("\nA generált tömb másolatának elemei: ", arrayTwo);
	}

	private static void copy(int[] arrayOne, int[] arrayTwo) {
		for (int i = 0; i < arrayOne.length; i++) {
			arrayTwo[i] = arrayOne[i];
		}
	}
}
