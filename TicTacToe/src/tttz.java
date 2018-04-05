
public class tttz {

	public static void main(String[] args) {
		char[][][] table;
		table = new char[5][4][4];

		// 1 LÉPÉS
		table[0][0][0] = 'X';
		table[0][0][1] = '_';
		table[0][0][2] = '_';
		table[0][0][3] = '\n';

		table[0][1][0] = '_';
		table[0][1][1] = '_';
		table[0][1][2] = '_';
		table[0][1][3] = '\n';

		table[0][2][0] = '_';
		table[0][2][1] = '_';
		table[0][2][2] = '_';
		table[0][2][3] = '\n';

		// 2 LÉPÉS
		table[1][0][0] = 'X';
		table[1][0][1] = 'O';
		table[1][0][2] = '_';
		table[1][0][3] = '\n';

		table[1][1][0] = '_';
		table[1][1][1] = '_';
		table[1][1][2] = '_';
		table[1][1][3] = '\n';

		table[1][2][0] = '_';
		table[1][2][1] = '_';
		table[1][2][2] = '_';
		table[1][2][3] = '\n';

		// 3 LÉPÉS
		table[2][0][0] = 'X';
		table[2][0][1] = 'O';
		table[2][0][2] = '_';
		table[2][0][3] = '\n';

		table[2][1][0] = '_';
		table[2][1][1] = 'X';
		table[2][1][2] = '_';
		table[2][1][3] = '\n';

		table[2][2][0] = '_';
		table[2][2][1] = '_';
		table[2][2][2] = '_';
		table[2][2][3] = '\n';

		// 4 LÉPÉS
		table[3][0][0] = 'X';
		table[3][0][1] = 'O';
		table[3][0][2] = '_';
		table[3][0][3] = '\n';

		table[3][1][0] = '_';
		table[3][1][1] = 'X';
		table[3][1][2] = '_';
		table[3][1][3] = '\n';

		table[3][2][0] = '_';
		table[3][2][1] = 'O';
		table[3][2][2] = '_';
		table[3][2][3] = '\n';

		// 5 LÉPÉS
		table[4][0][0] = 'X';
		table[4][0][1] = 'O';
		table[4][0][2] = '_';
		table[4][0][3] = '\n';

		table[4][1][0] = '_';
		table[4][1][1] = 'X';
		table[4][1][2] = '_';
		table[4][1][3] = '\n';

		table[4][2][0] = '_';
		table[4][2][1] = 'O';
		table[4][2][2] = 'X';
		table[4][2][3] = '\n';

		int i = 1;

		for (char[][] iTomb : table) {
			System.out.print("\n" + i + ". lépés!" + "\n");
			for (char[] aTomb : iTomb) {
				for (char anTomb : aTomb) {
					System.out.print(anTomb);
				}
			}
			i++;
		}
	}
}