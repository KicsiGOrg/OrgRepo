
public class Main {

	public static void main(String[] args) {

		Player playerOne = new Player();
		Player playerTwo = new Player();
		Player.creatPlayer(playerOne, playerTwo);
		Welcome.welcome();
		Welcome.players(playerOne, playerTwo);
		Game.game(playerOne, playerTwo);
	}
}
