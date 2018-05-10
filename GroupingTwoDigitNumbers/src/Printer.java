
public class Printer {
	/**
	 * Tömb elemeinek kiíratása
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		int p = 19;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (i == p) {
				System.out.println();
				p += 20;
			}
		}
	}

	/**
	 * Csoportosított számok kiíratása
	 * 
	 * @param counters
	 */
	public static void counter(int[] counters) {
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Csoportosítás tízesével:");
		for (int i = 0; i < counters.length; i++) {
			switch (i) {
			case 0:
				System.out.println("10 - 19 csoportban " + counters[i] + " szám található.");
				break;
			case 1:
				System.out.println("20 - 29 csoportban " + counters[i] + " szám található.");
				break;
			case 2:
				System.out.println("30 - 39 csoportban " + counters[i] + " szám található.");
				break;
			case 3:
				System.out.println("40 - 49 csoportban " + counters[i] + " szám található.");
				break;
			case 4:
				System.out.println("50 - 59 csoportban " + counters[i] + " szám található.");
				break;
			case 5:
				System.out.println("60 - 69 csoportban " + counters[i] + " szám található.");
				break;
			case 6:
				System.out.println("70 - 79 csoportban " + counters[i] + " szám található.");
				break;
			case 7:
				System.out.println("80 - 89 csoportban " + counters[i] + " szám található.");
				break;
			case 8:
				System.out.println("90 - 99 csoportban " + counters[i] + " szám található.");
				break;
			}
		}
	}
}
