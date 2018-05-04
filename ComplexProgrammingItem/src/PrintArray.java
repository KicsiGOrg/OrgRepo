
public class PrintArray {

	public static void printArray(String message, int[] array) {
		System.out.print(message);
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
