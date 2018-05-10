import java.util.Random;

public class Filler {

	static int[] values = new int[200];
	static int groupOne = 0;
	static int groupTwo = 0;
	static int groupThree = 0;
	static int groupFour = 0;
	static int groupFive = 0;
	static int groupSix = 0;
	static int groupSeven = 0;
	static int groupEight = 0;
	static int groupNine = 0;

	/**
	 * Tömb feltöltés
	 * 
	 * @param array
	 * @param counters
	 * @return
	 * 
	 * 		Feltölti a tömböt random számokkal és a generált számról
	 *         megállapítja, hogy melyik tizes csoportba tartozik és ezzel növeli a
	 *         csoport gyűjtőszámát.
	 */
	public static int[] fillTheArray(int[] array, int[] counters) {
		System.out.println("A tömb elemei:");
		for (int i = 0; i < array.length; i++) {
			Random rn = new Random();
			int value = rn.nextInt(100 - 10) + 10;
			values[i] = value;
			if (value < 20) {
				groupOne++;
				counters[0] = groupOne;
			} else if (value > 19 && value < 30) {
				groupTwo++;
				counters[1] = groupTwo;
			} else if (value > 29 && value < 40) {
				groupThree++;
				counters[2] = groupThree;
			} else if (value > 39 && value < 50) {
				groupFour++;
				counters[3] = groupFour;
			} else if (value > 49 && value < 60) {
				groupFive++;
				counters[4] = groupFive;
			} else if (value > 59 && value < 70) {
				groupSix++;
				counters[5] = groupSix;
			} else if (value > 69 && value < 80) {
				groupSeven++;
				counters[6] = groupSeven;
			} else if (value > 79 && value < 90) {
				groupEight++;
				counters[7] = groupEight;
			} else {
				groupNine++;
				counters[8] = groupNine;
			}
		}
		return values;
	}
}
