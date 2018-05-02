import java.util.HashMap;
import java.util.Scanner;

public interface IGame {

	static Scanner sc = new Scanner(System.in);
	
	public static void welcome() {
		System.out.println("Kő papír olló játék.");
		System.out.println(
				"Menü\n**********************\n1 - Játék a megadott körökig\n2 - Játék a megadott pontszámig\n");
	}
	
	public static void statics(User userA, User userB, int gameEqual) {
		System.out.println("--------------------------Statisztikák--------------------------");
		System.out.println("\nGyőzelmi statisztika:\n" + userA.userName + ": " + userA.userWin + " győzelem.\n" + userB.userName + ": "
				+ userB.userWin + " győzelem.\n" + gameEqual + " döntetlen.\n\n----------------------------------------------------------------");
		System.out.println("\nJel statisztika:\n" + userA.userName + "\n Kő: " + userA.userRock + "\n Papír: " + userA.userPaper
				+ "\n Olló: " + userA.userScissors + "\n" + userB.userName + "\n Kő: " + userB.userRock + "\n Papír: " + userB.userPaper
				+ "\n Olló: " + userB.userScissors + "\n\n----------------------------------------------------------------");
		System.out.println("\n" + userA.userName + "\n Kővel nyert: " + userA.winRock + "\n Papírral nyert: " + userA.winPaper
				+ "\n Ollóval nyert: " + userA.winScissors + "\n" + userB.userName + "\n Kővel nyert: " + userB.winRock
				+ "\n Papírral nyert: " + userB.winPaper + "\n Ollóval nyert: " + userB.winScissors
				+ "\n\n----------------------------------------------------------------");
		System.out.print("\nA játék során " + gameEqual + " dönetetlen született:" + "\n Kő: " + userA.drawRock + "\n Papír: "
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
	
}
