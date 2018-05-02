import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RockPaperScissors implements IGame {
	/*
	 * Statisztika a játék során mennyi volt a győztes, vesztes, döntetlen kör (jelekre bontva! A győztes és a döntetlen készen van!).
	 * 
	 * Ugyanerről a két játékos összesített statisztikát is írja ki.
	 */

	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	static int round = 1;
	static HashMap<Integer, Integer> menuIndex;
	static int endOfPoint;
	static int endOfRound;
	static int gameEqual = 0;
	static User userA;
	static User userB;

	public static void main(String[] args) {
		IGame.welcome();
		menuIndex = IGame.selectFromTheMenu();
		userA = new User(1);
		userB = new User(2);
		gamePlay();
		IGame.statics(userA, userB, gameEqual);
		sc.close();
	}

	private static void gamePlay() {
		Set<Integer> index = menuIndex.keySet();
		for (Integer key : index) {
			switch (key) {
			case 1:
				for (int i = 0; i < menuIndex.get(key); i++) {
					game();
				}
				break;
			case 2:
				do {
					game();
				} while (menuIndex.get(key) > userA.userWin && menuIndex.get(key) > userB.userWin);
				break;
			}
		}
	}

	private static void game() {
		HashMap<Integer, String> setOfValues;
		setOfValues = new HashMap<Integer, String>();
		setOfValues.put(0, "Kő");
		setOfValues.put(1, "Papír");
		setOfValues.put(2, "Olló");
		userA.randomNumberAndSignChecker();
		userB.randomNumberAndSignChecker();
		System.out.println(round + " kör: " + userA.userName + " " + setOfValues.get(userA.userRandomNumber) + " - "
				+ userB.userName + " " + setOfValues.get(userB.userRandomNumber));
		if (userA.userRandomNumber == userB.userRandomNumber) {
			System.out.println("Döntetlen.");
			gameEqual++;
			switch (userA.userRandomNumber) {
			case 0:
				userA.drawRock++;
				break;
			case 1:
				userA.drawPaper++;
				break;
			case 2:
				userA.drawScissors++;
				break;
			}
		} else if (userA.userRandomNumber == 1) {
			if (userB.userRandomNumber == 2) {
				IGame.bUserWin(userB);
				userB.winPaper++;
			} else {
				IGame.aUserWin(userA);
				userA.winRock++;
			}
		} else if (userA.userRandomNumber == 2) {
			if (userB.userRandomNumber == 1) {
				IGame.aUserWin(userA);
				userA.winPaper++;
			} else {
				IGame.bUserWin(userB);
				userB.winScissors++;
			}
		} else {
			if (userB.userRandomNumber == 1) {
				IGame.bUserWin(userB);
				userB.winPaper++;
			} else {
				IGame.aUserWin(userA);
				userA.winRock++;
			}
		}
		System.out.println("A játék állása: \n" + userA.userName + " - " + userA.userWin + " \\ " + userB.userName
				+ " - " + userB.userWin + "\nDönetetlen: " + gameEqual + "\n");
		round++;
	}

}