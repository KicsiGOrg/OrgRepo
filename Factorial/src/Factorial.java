
public class Factorial {

	public static void main(String[] args) {

		int[] originalNumberArrays = { 0, 1, 5, 7, 10 };
		int[] numberArrays = { 0, 1, 5, 7, 10 };

		for (int j = 0; numberArrays.length > j; j++) {
			for (int i = numberArrays[j] - 1; i > 0; i--) {
				numberArrays[j] = numberArrays[j] * i;
			}
			if (numberArrays[j] == 0) {
				System.out.println(originalNumberArrays[j] + "! = 1");
			} else {
				System.out.println(originalNumberArrays[j] + "! = " + numberArrays[j]);
			}
		}
	}
}