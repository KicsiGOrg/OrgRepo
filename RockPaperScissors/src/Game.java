import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Game {

	static Scanner sc = new Scanner(System.in);
	static int menuIndex;
	static int userSign;
	static int userTwoSign;

	/**
	 * Welcome üzenet kiíratás
	 */
	public static void welcome() {
		System.out.println("Kő papír olló\n");
	}
	
	/**
	 * Menü kiíratás
	 */
	public static void menu() {
		System.out.println(
				"\n          Játékmenet\n*******************************\n1 - Játék a megadott körökig\n2 - Játék a megadott pontszámig\n");
	}

	/**
	 * Statisztikák kiíratása
	 * @param userA
	 * @param userB
	 * 
	 *            Statisztika kiírása userenként. - Győzelmi statisztika - Jel
	 *            statisztika - Jelek szerinti győzelmek és vesztések összesítése
	 *            user-re bontva. - Döntetlenek összesítése és jelekre bontása
	 * 
	 */
	public static void printStatistics(User userA, User userB) {
		System.out.println("--------------------------Statisztikák--------------------------");
		System.out.println("\nGyőzelmi statisztika:\n" + userA.userName + ": " + userA.userWin + " győzelem.\n"
				+ userB.userName + ": " + userB.userWin + " győzelem.\n" + userA.gameEqual + " döntetlen:" + "\n Kő: "
				+ userA.drawRock + "\n Papír: " + userA.drawPaper + "\n Olló: " + userA.drawScissors
				+ "\n\n----------------------------------------------------------------");
		System.out.println("\nJel statisztika:\n" + userA.userName + "\n Kő: " + userA.userRock + "\n Kővel nyert: "
				+ userA.winRock + "\n Kővel vesztett: " + userA.lossRock + "\n Papír: " + userA.userPaper
				+ "\n Papírral nyert: " + userA.winPaper + "\n Papírral vesztett: " + userA.lossPaper + "\n Olló: "
				+ userA.userScissors + "\n Ollóval nyert: " + userA.winScissors + "\n Ollóval vesztett: "
				+ userA.lossScissors + "\n\n" + userB.userName + "\n Kő: " + userB.userRock + "\n Kővel nyert: "
				+ userB.winRock + "\n Kővel vesztett: " + userB.lossRock + "\n Papír: " + userB.userPaper
				+ "\n Papírral nyert: " + userB.winPaper + "\n Papírral vesztett: " + userB.lossPaper + "\n Olló: "
				+ userB.userScissors + "\n Ollóval nyert: " + userB.winScissors + "\n Ollóval vesztett: "
				+ userB.lossScissors + "\n\n----------------------------------------------------------------");
	}

	/**
	 * Győzelmek vezetése
	 * @param userA
	 * 
	 *            Kiírja a győztes nevét és növeli a győzelmek számát.
	 */
	public static void userWin(User user) {
		System.out.println(user.userName + " győztél.");
		user.userWin++;
	}
	
	/**
	 * Játékmód választás és játék vége megadása
	 * @return
	 * 
	 * 		A user választja ki, hogy a játékot körök vagy pontszám alapján
	 *         szeretné futtatni. A választása után megadhatja, hogy hány körig vagy
	 *         hány győztes menetig menjen a játék.
	 */
	public static HashMap<Integer, Integer> selectFromTheMenu() {
		int endOfPoint;
		int endOfRound;
		HashMap<Integer, Integer> response = new HashMap<Integer, Integer>();
		do {
			try {
				System.out.print("Kérem válasszon a menüből: ");
				menuIndex = sc.nextInt();
				sc.nextLine();
				if (menuIndex != 1 && menuIndex != 2) {
					System.out.println("A megadott menüpont hibás!");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott menüpont nem értelmezett.");
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

	/**
	 * Játékmenet controller
	 * @param userA
	 * @param userB
	 * @param menuIndex
	 * @param playModeMenuNumber
	 * 
	 *            Játékmenet elágazása a menuIndex alapján. 
	 *            1 - Körökszámáig tartó játékmenet (for ciklusban) 
	 *            2 - Pontszámokig tartó játékmenet (do while ciklusban)
	 * 
	 */
	public static void gamePlay(User userA, User userB, HashMap<Integer, Integer> menuIndex, int playModeMenuNumber) {
		Set<Integer> index = menuIndex.keySet();
		for (Integer key : index) {
			switch (key) {
			case 1:
				for (int i = 0; i < menuIndex.get(key); i++) {
					game(userA, userB, playModeMenuNumber);
				}
				break;
			case 2:
				do {
					game(userA, userB, playModeMenuNumber);
				} while (menuIndex.get(key) > userA.userWin && menuIndex.get(key) > userB.userWin);
				break;
			}
		}
	}

	/**
	 * Játékmenet
	 * @param userA
	 * @param userB
	 * @param playModeMenuNumber
	 * 
	 *            playModeMenuNumber változóban kapott szám alapján: - 1 - random
	 *            generál mind a két játékos számára "jelet" - 2 - a user ad be
	 *            "jelet" és a program random generál a második játékos számára
	 *            "jelet".
	 * 
	 *            Amikor a program ugyanazt a "jelet" kapja mind a két játékostól,
	 *            akkor döntetlen és növeli a "bemutatott" jelhez tartozó változó
	 *            értékét.
	 * 
	 *            A játékmenettől függetlenül az első játékos által bemutatott jel
	 *            alapján rögzíti: 
	 *            - a győzelmet/vesztést 
	 *            - a győztes/vesztes szimbólumot.
	 * 
	 *            Minden lefutott kör után kiírja a játék aktuális állását.
	 */
	private static void game(User userA, User userB, int playModeMenuNumber) {
		Map<Integer, String> setOfValues = Map.of(0, "Kő", 1, "Papír", 2, "Olló");
		if (playModeMenuNumber == 1) {
			userSign = userA.randomNumberAndSignChecker();
			userTwoSign = userB.randomNumberAndSignChecker();
		} else {
			userSign = userA.getUserSign(sc);
			userTwoSign = userB.randomNumberAndSignChecker();
		}
		System.out.println(userA.round + " kör: " + userA.userName + " " + setOfValues.get(userSign) + " - "
				+ userB.userName + " " + setOfValues.get(userTwoSign));
		if (userSign == userTwoSign) {
			System.out.println("Döntetlen.");
			userA.gameEqual++;
			switch (userSign) {
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
		} else {
			if (userSign == 1) {
				if (userTwoSign == 2) {
					Game.userWin(userB);
					userB.winScissors++;
					userA.lossPaper++;
				} else {
					Game.userWin(userA);
					userA.winPaper++;
					userB.lossRock++;
				}
			} else if (userSign == 2) {
				if (userTwoSign == 1) {
					Game.userWin(userA);
					userA.winScissors++;
					userB.lossPaper++;
				} else {
					Game.userWin(userB);
					userB.winRock++;
					userA.lossScissors++;
				}
			} else {
				if (userTwoSign == 1) {
					Game.userWin(userB);
					userB.winPaper++;
					userA.lossRock++;
				} else {
					Game.userWin(userA);
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
