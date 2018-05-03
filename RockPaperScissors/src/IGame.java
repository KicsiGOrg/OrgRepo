import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public interface IGame {

	static Scanner sc = new Scanner(System.in);
	
	public static void welcome() {
		System.out.println("Kő papír olló játék.");
		System.out.println(
				"Menü\n**********************\n1 - Játék a megadott körökig\n2 - Játék a megadott pontszámig\n");
	}
	
	public static void statics(User userA, User userB) {
		System.out.println("--------------------------Statisztikák--------------------------");
		System.out.println("\nGyőzelmi statisztika:\n" + userA.userName + ": " + userA.userWin + " győzelem.\n" + userB.userName + ": "
				+ userB.userWin + " győzelem.\n" + userA.gameEqual + " döntetlen.\n\n----------------------------------------------------------------");
		System.out.println("\nJel statisztika:\n" + userA.userName + "\n Kő: " + userA.userRock + "\n Papír: " + userA.userPaper
				+ "\n Olló: " + userA.userScissors + "\n" + userB.userName + "\n Kő: " + userB.userRock + "\n Papír: " + userB.userPaper
				+ "\n Olló: " + userB.userScissors + "\n\n----------------------------------------------------------------");
		System.out.println("\n" + userA.userName + "\n Kővel nyert: " + userA.winRock + "\n Kővel vesztett: " + userA.lossRock 
				+ "\n Papírral nyert: " + userA.winPaper + "\n Papírral vesztett: " + userA.lossPaper
				+ "\n Ollóval nyert: " + userA.winScissors + "\n Ollóval vesztett: " + userA.lossScissors
				+ "\n" + userB.userName + "\n Kővel nyert: " + userB.winRock + "\n Kővel vesztett: " + userB.lossRock
				+ "\n Papírral nyert: " + userB.winPaper + "\n Papírral vesztett: " + userB.lossPaper
				+ "\n Ollóval nyert: " + userB.winScissors + "\n Ollóval vesztett: " + userB.lossScissors
				+ "\n\n----------------------------------------------------------------");
		System.out.print("\nA játék során " + userA.gameEqual + " dönetetlen született:" + "\n Kő: " + userA.drawRock + "\n Papír: "
				+ userA.drawPaper + "\n Olló: " + userA.drawScissors + "\n\n----------------------------------------------------------------");
	}
	
	public static void bUserWin(User userB) {
		System.out.println(userB.userName + " győztél.");
		userB.userWin++;
	}

	public static void aUserWin(User userA) {
		System.out.println(userA.userName + " győztél.");
		userA.userWin++;
	}

	public static HashMap<Integer, Integer> selectFromTheMenu() {
		int menuIndex;
		int endOfPoint;
		int endOfRound;
		HashMap<Integer, Integer> response = new HashMap<Integer, Integer>(); 
		do {
			System.out.print("Kérem válasszon a menüből: ");
			menuIndex = sc.nextInt();
			sc.nextLine();
			if (menuIndex != 1 && menuIndex != 2) {
				System.out.println("A megadott menüpont hibás!");
			}
		} while (menuIndex != 1 && menuIndex != 2);
		switch (menuIndex) {
		case 1:
			do {
				System.out.print("Add meg hány körig menjen a játék: ");
				endOfRound = sc.nextInt();
				sc.nextLine();
				if (endOfRound < 1) {
					System.out.println("A megadott szám túl kicsi, kérem 0-nál nagyobb számot adjon meg!");
				}
			} while (endOfRound < 1);
			response.put(menuIndex, endOfRound);
			break;
		case 2:
			do {
				System.out.print("Add meg hány pontig menjen a játék: ");
				endOfPoint = sc.nextInt();
				sc.nextLine();
				if (endOfPoint < 1) {
					System.out.println("A megadott szám túl kicsi, kérem 0-nál nagyobb számot adjon meg!");
				}
			} while (endOfPoint < 1);
			response.put(menuIndex, endOfPoint);
			break;
		}
		return response;
	}
	
	public static void gamePlay(User userA,User userB, HashMap<Integer, Integer> menuIndex) {
		Set<Integer> index = menuIndex.keySet();
		for (Integer key : index) {
			switch (key) {
			case 1:
				for (int i = 0; i < menuIndex.get(key); i++) {
					game(userA, userB);
				}
				break;
			case 2:
				do {
					game(userA, userB);
				} while (menuIndex.get(key) > userA.userWin && menuIndex.get(key) > userB.userWin);
				break;
			}
		}
	}

	private static void game(User userA, User userB) {
		HashMap<Integer, String> setOfValues;
		setOfValues = new HashMap<Integer, String>();
		setOfValues.put(0, "Kő");
		setOfValues.put(1, "Papír");
		setOfValues.put(2, "Olló");
		userA.randomNumberAndSignChecker();
		userB.randomNumberAndSignChecker();
		System.out.println(userA.round + " kör: " + userA.userName + " " + setOfValues.get(userA.userRandomNumber) + " - "
				+ userB.userName + " " + setOfValues.get(userB.userRandomNumber));
		if (userA.userRandomNumber == userB.userRandomNumber) {
			System.out.println("Döntetlen.");
			userA.gameEqual++;
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
		} 
		else {
			if (userA.userRandomNumber == 1) {
				if (userB.userRandomNumber == 2) {
					IGame.bUserWin(userB);
					userB.winScissors++;
					userA.lossPaper++;
				} else {
					IGame.aUserWin(userA);
					userA.winPaper++;
					userB.lossRock++;
				}
			} else if (userA.userRandomNumber == 2) {
				if (userB.userRandomNumber == 1) {
					IGame.aUserWin(userA);
					userA.winScissors++;
					userB.lossPaper++;
				} else {
					IGame.bUserWin(userB);
					userB.winRock++;
					userA.lossScissors++;
				}
			} else {
				if (userB.userRandomNumber == 1) {
					IGame.bUserWin(userB);
					userB.winPaper++;
					userA.lossRock++;
				} else {
					IGame.aUserWin(userA);
					userA.winRock++;
					userB.lossScissors++;
				}
			}	
		}
		System.out.println("A játék állása: \n" + userA.userName + " - " + userA.userWin + " \\ " + userB.userName
				+ " - " + userB.userWin + "\nDönetetlen: " + userA.gameEqual + "\n");
		userA.round++;
	}
}
