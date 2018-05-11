
public class Printer {

	/**
	 * Üdvözlő üzenet
	 */
	public static void welcome() {
		System.out.println("Üdvözöljük olvasóinkat ezen a jeles Tenisz eseményen innen "
				+ Tournaments.randomLocation().getTextual()
				+ "\nAhogy az IP címekből látom összegyűlt a világ színe JAVA\n\nA mérkőzés máris kezdetét veszi.");

	}

	/**
	 * Kiírja a játékosok nevét a meccs elején.
	 * 
	 * @param playerOne
	 * @param playerTwo
	 */
	public static void players(Player playerOne, Player playerTwo) {
		System.out.println(playerOne.getName() + " és " + playerTwo.getName() + " összecsapásának lehetünk szemtanúi.");
	}

	/**
	 * Kiírja a meccs nyertesének a nevét és a pontszámokat
	 * 
	 * @param playerOne
	 * @param playerTwo
	 * @param playerOneSet
	 * @param playerTwoSet
	 */
	public static void printWinner(Player playerOne, Player playerTwo, int playerOneSet, int playerTwoSet) {
		if (playerOneSet > playerTwoSet) {
			System.out.println("\n" + playerOne.getName().getTextual() + " nyerte a meccset " + playerOneSet + " : "
					+ playerTwoSet);
		} else {
			System.out.println("\n" + playerTwo.getName().getTextual() + " nyerte a meccset " + playerTwoSet + " : "
					+ playerOneSet);
		}
	}
}
