
public class Welcome {

	public static void welcome() {
		System.out.println("Üdvözöljük olvasóinkat ezen a jeles Tenisz eseményen innen "
				+ Tournaments.randomLocation().getTextual()
				+ "\nAhogy az IP címekből látom összegyűlt a világ színe JAVA\n\nA mérkőzés máris kezdetét veszi.");

	}
	public static void players(Player playerOne, Player playerTwo) {
		System.out.println(playerOne.getName() + " és " +  playerTwo.getName() + " összecsapásának lehetünk szemtanúi.\n");
	}
	
}
