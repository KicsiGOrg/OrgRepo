import java.util.Random;

public class CreateAnArray {

	static Random rn = new Random();

	public static int[] createAnArray(int userInput) {
		int[] array = new int[userInput];
		return array;
	}

	public static int[] fillArray(int userInput) {
		int[] array = new int[userInput];
		for (int i = 0; i < userInput; i++) {
			int a = rn.nextInt(90) + 10;
			array[i] = a;
		}
		return array;
	}
}
