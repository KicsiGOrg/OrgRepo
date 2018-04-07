
public class NestedLoops {

	static int min = 500;
	static int max = 800;
	static int i;

	public static void main(String[] args) {

		int[] numbers = new int[max - min];

		do {
			for (i = min; i < max; i++) {
				String strI = i + "";
				String x = strI.substring(1, strI.length() - 1);
				for (int j = 0; j < 300; j++) {
					if (x.equals("5") || x.equals("6") || x.equals("7") || x.equals("8")) {
						int lastDigit = i % 10;
						if (lastDigit >= 2 && lastDigit <= 7) {
							numbers[j] = i;
							System.out.println(numbers[j]);
							break;
						}
					}
				}
			}
		} while (i != max);
	}
}