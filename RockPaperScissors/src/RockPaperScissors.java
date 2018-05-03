import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGame {

	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Integer> menuIndex;
	static int endOfPoint;
	static int endOfRound;
	static User userA;
	static User userB;

	public static void main(String[] args) {
		IGame.welcome();
		menuIndex = IGame.selectFromTheMenu();
		userA = new User(1);
		userB = new User(2);
		IGame.gamePlay(userA,userB, menuIndex);
		IGame.statics(userA, userB);
		sc.close();
	}
}