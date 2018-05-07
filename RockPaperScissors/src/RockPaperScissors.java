import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors  {

	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Integer> gameOverIndex;
	static int endOfPoint;
	static int endOfRound;
	static User userA;
	static User userB;
	static int playModeNumber;

	public static void main(String[] args) {
		Game.welcome();
		playModeNumber = PlayMode.selectPlayerMode(sc);
		gameOverIndex = Game.selectFromTheMenu();
		PlayMode.game(userA, userB, playModeNumber, gameOverIndex);
		sc.close();
	}
}