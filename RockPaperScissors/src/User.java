
import java.util.Random;
import java.util.Scanner;

public class User {
	
	static Scanner sc = new Scanner(System.in);

	String userName;
	int userWin;
	int gameEqual;
	int userRock;
	int userPaper;
	int userScissors;
	int userRandomNumber;
	int drawRock;
	int drawPaper;
	int drawScissors;
	int winRock;
	int winPaper;
	int winScissors;
	int round = 1;
	int lossRock;
	int lossPaper;
	int lossScissors;
	static int userSign;

	/**
	 * Névmegadás
	 * 
	 * @param i
	 * @param playModeMenuNumber
	 * 
	 *            Névmegadás a játékmód alapján.
	 * 
	 */
	public User(int i, int playModeMenuNumber) {
		if (playModeMenuNumber == 1) {
			System.out.print("Kérem adja meg az " + i + " gépi játékos nevét: ");
			this.userName = sc.nextLine();
		} else {
			if (i == 1) {
				System.out.print("Kérem adja meg a játékos nevét: ");
				this.userName = sc.nextLine();
			} else {
				System.out.print("A gépi játékos neve: CPU\n\n");
				this.userName = "CPU";
			}
		}
	}
	
	public String cpuUser() {
		return userName;
	}

	/**
	 * Random generátor a jelekhez
	 * @return
	 * 
	 * 		A Random szám generátor generál egy számot a [0,1,2] zárt
	 *         tartományból, annak átadása a userSignRegistration metódusnak, ami
	 *         alapján növeli a Game.game metódusban létrehozott Map indexeinek
	 *         megfelelő jel számlálóját.
	 */
	public int randomNumberAndSignChecker() {
		Random random = new Random();
		userSign = random.nextInt((3 - 1) + 1);
		userSignRegistration(userSign);
		return userSign;
	}

	/**
	 * User input a jelekhez
	 * @param sc
	 * @return
	 * 
	 * 		Felhasználó által megadott jel indexének bekérése, átadása a
	 *         userSignRegistration metódusnak, ami növeli a Game.game metódusban
	 *         létrehozott Map indexeinek megfelelő jel számlálóját.
	 */
	public int getUserSign (Scanner sc) {
		do {
			try {
				System.out.println(" 0 - Kő\n 1 - Papír\n 2 - Olló");
				System.out.print("Kérem válasszon: ");
				userSign = sc.nextInt();
				sc.nextLine();
				if(userSign < 0 || userSign > 2) {
					System.out.println("Nem értelmezett jel.");
				}
			}
			catch(Exception e) {
				sc.nextLine();
				System.out.println("Nem értelmezett jel.");
			}
		}
		while(userSign < 0 || userSign > 2);
		userSignRegistration(userSign);
		return userSign;
	}
	
	/**
	 * Jelek számolása a statisztikákhoz
	 * @param userSign
	 * 
	 *            Növeli a user által megjátszott jelek számlálóját.
	 */
	public void userSignRegistration (int userSign) {
		switch (userSign) {
		case 0:
			userRock++;
			break;
		case 1:
			userPaper++;
			break;
		case 2:
			userScissors++;
			break;
		}
	}
}
