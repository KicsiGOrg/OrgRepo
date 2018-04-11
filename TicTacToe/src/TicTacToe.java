public class TicTacToe {

	public static void main(String[] args) {

		char[][][] tomb = {
				{ { '_', ' ', '_', ' ', '_', '\n' }, { '_', ' ', '_', ' ', '_', '\n' },
						{ '_', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', '_', ' ', '_', '\n' }, { '_', ' ', '_', ' ', '_', '\n' },
						{ '_', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', '_', ' ', '_', '\n' }, { '_', ' ', 'O', ' ', '_', '\n' },
						{ '_', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', '_', ' ', '_', '\n' }, { 'X', ' ', 'O', ' ', '_', '\n' },
						{ '_', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', '_', ' ', '_', '\n' }, { 'X', ' ', 'O', ' ', '_', '\n' },
						{ 'O', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', '_', ' ', 'X', '\n' }, { 'X', ' ', 'O', ' ', '_', '\n' },
						{ 'O', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', 'O', ' ', 'X', '\n' }, { 'X', ' ', 'O', ' ', '_', '\n' },
						{ 'O', ' ', '_', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', 'O', ' ', 'X', '\n' }, { 'X', ' ', 'O', ' ', '_', '\n' },
						{ 'O', ' ', 'X', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', 'O', ' ', 'X', '\n' }, { 'X', ' ', 'O', ' ', 'O', '\n' },
						{ 'O', ' ', 'X', ' ', '_', '\n' } },
				{ { '\n', 'X', ' ', 'O', ' ', 'X', '\n' }, { 'X', ' ', 'O', ' ', 'O', '\n' },
						{ 'O', ' ', 'X', ' ', 'X' } } };

		int i = 0;

		for (char[][] iTomb : tomb) {
			System.out.print("\n" + i + ". lépés!" + "\n");
			for (char[] aTomb : iTomb) {
				for (char anTomb : aTomb) {
					System.out.print(anTomb);
				}
			}
			i++;
		}
		System.out.println("\n\n------------ Game Over ------------\n");
	}
}