import java.util.HashMap;
import java.util.Scanner;

public class PlayMode {

	static int playModeMenuNumber = 0;

	/**
	 * Játékosmód választás
	 * @param sc
	 * @return playModeMenuNumber
	 * 
	 *         1 - CPU vs. CPU 2 - Felhasználó vs. CPU
	 * 
	 */
	public static int selectPlayerMode (Scanner sc) {
		System.out.println("         Játékos mód\n******************************\n 1 - CPU vs. CPU\n 2 - Felhasználó vs. CPU\n");
		do {
			try {
				System.out.print("Kérem válasszon játékos módot: ");
				playModeMenuNumber = sc.nextInt();
				sc.nextLine();
				if(playModeMenuNumber < 1 || playModeMenuNumber > 2) {
					System.out.println("A megadott menüpont hibás.");
				}
			}
			catch(Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezett.");
			}
		}while(playModeMenuNumber < 1 || playModeMenuNumber > 2);
		Game.menu();
		return playModeMenuNumber;
	}
	
	/**
	 * Játék
	 * 
	 * @param userA
	 * @param userB
	 * @param playModeMenuNumber
	 * @param gameOverIndex
	 * 
	 *            selectPlayerMode-ban választott pont alapján folytatódik a játék
	 *            gép a gép ellen vagy felhasználó a gép elleni módban.
	 * 
	 */
	public static void game(User userA, User userB, int playModeMenuNumber, HashMap<Integer, Integer> gameOverIndex) {
		if(playModeMenuNumber == 1) {
			userA = new User(1, playModeMenuNumber);
			userB = new User(2, playModeMenuNumber);
			Game.gamePlay(userA, userB, gameOverIndex, playModeMenuNumber);
		}else {
			userA = new User(1, playModeMenuNumber);
			userB = new User(2, playModeMenuNumber);
			Game.gamePlay(userA, userB, gameOverIndex, playModeMenuNumber);
		}
		Game.printStatistics(userA, userB);
	}
}
