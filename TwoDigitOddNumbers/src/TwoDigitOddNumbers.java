
public class TwoDigitOddNumbers {

	public static void main(String[] args) {

		iteratedByOne();
		breakLine();
		iteratedByTwo();
	}

	private static void breakLine() {
		System.out.println("\n\n--------------------------------------------------------------------------------------------------------------------------------------\n");
	}

	private static void iteratedByOne() {
		for(int i = 10; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	private static void iteratedByTwo() {
		for(int i = 10; i < 100; i+=2) {
			System.out.print(i + " ");
		}
	}
}