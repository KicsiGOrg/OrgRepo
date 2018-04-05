public class DivisorFiveTrue {

	public static void main(String[] args) {
		solutuinOne();
		soulutionTwo();
		solutionThree();
	}

	private static void solutionThree() {
		int i = 10;
		do {
			System.out.println(i);
			i+=5;
		}while(i != 100);
		System.out.println("\nEnd of Solution 3!\n");
	}

	private static void soulutionTwo() {
		for (int i = 10; i < 100; i += 5) {
			System.out.println(i);
		}
		System.out.println("\nEnd of Solution 2!\n");
	}

	private static void solutuinOne() {
		for(int i = 10; i < 100; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("\nEnd of Solution 1!\n");
	}
}