
public class Main {

	public static void main(String[] args) {

		Player playerOne = new Player();
		Player playerTwo = new Player();
		PlayerDraw.randomPlayer();
		PlayerDraw.fillPairArrays();
		Player.creatPlayer(playerOne, playerTwo);
		Printer.welcome();
		PlayerDraw.print();
		Printer.players(playerOne, playerTwo);
//		Game.game(playerOne, playerTwo);
//		GameTwo.game(playerOne, playerTwo);
	}
}
