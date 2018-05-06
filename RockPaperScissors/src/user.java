import java.util.Random;
import java.util.Scanner;

public class user {
	
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
	
	public user(int i) {
		System.out.print("Kérem adja meg az " + i + " játékos nevét: ");
		this.userName = sc.nextLine();
	}
	
	public String cpuUser() {
		this.userName = "CPU";
		return userName;
	}

	public int randomNumberAndSignChecker() {
		Random random = new Random();
		userSign = random.nextInt((3 - 1) + 1);
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
		return userSign;
	}
	
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
		return userSign;
	}
	
}
