public class Eratoszthenesz_II {

	public static void main(String[] args) {

		// tomb[i] false -> Prím
		boolean[] tomb = new boolean[1000];

		int p;
		for (int i = 2; i < tomb.length; i++) {
			if (!tomb[i]) {
				System.out.println(i);
				for (p = 2; p * i < tomb.length; p++) {
					tomb[p * i] = true;

				}
			}
		}
	}
}