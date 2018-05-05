public class DivisorFiveFalse {

	public static void main(String[] args) {
		solutionOne();
		soulutionTwo();
		solutionThree();
	}

	private static void solutionThree() {
		int i = 10;
		do {
			if (i % 5 == 0) {
			} else {
				System.out.println(i);
			}
			i++;
		} while (i != 100);
		System.out.println("\nEnd of Solution 3!\n");
	}

	private static void soulutionTwo() {
		for (int i = 10; i < 100; i++) {
			int lastDigit = i % 10;
			if (lastDigit == 5 || lastDigit == 0) {
			} else {
				System.out.println(i);
			}
		}
		System.out.println("\nEnd of Solution 2!\n");
	}

	private static void solutionOne() {
		for (int i = 10; i < 100; i++) {
			if (i % 5 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("\nEnd of Solution 1!\n");
	}
}