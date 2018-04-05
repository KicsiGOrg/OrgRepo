public class Eratoszthenesz_III {

	public static void main(String[] args) {

		// tomb[i] true -> Prím
		boolean[] tomb = new boolean[1000];

		for (int i = 2; i < tomb.length; i++) {
			tomb[i] = true;
		}

		int p;
		for (int i = 2; i < tomb.length; i++) {
			if (tomb[i]) {
				System.out.println(i);
				for (p = 2; p * i < tomb.length; p++) {
					tomb[p * i] = false;
					while (p * i < tomb.length) {
						tomb[p * i] = false;
						p++;
					}
				}
			}
		}
	}
}