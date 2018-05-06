import java.util.HashMap;
import java.util.Scanner;

public class PlayMode {

	static int playModeMenuNumber = 0;
	
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
	
	public static void game(user userA, user userB, int playModeMenuNumber, HashMap<Integer, Integer> gameOverIndex) {
		if(playModeMenuNumber == 1) {
			userA = new user(1);
			userB = new user(2);
			Game.gamePlay(userA, userB, gameOverIndex, playModeMenuNumber);
		}else {
			userA = new user(1);
			userB = new user(2);
			Game.gamePlay(userA, userB, gameOverIndex, playModeMenuNumber);
		}
		Game.statics(userA, userB);
	}
	
	
}
