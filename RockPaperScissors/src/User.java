import java.util.Random;
import java.util.Scanner;

public class User {
	
	static Scanner sc = new Scanner(System.in);

	public User(int i) {
		System.out.print("Kérem adja meg az " + i + " játékos nevét: ");
		this.userName = sc.nextLine();
	}

	public void randomNumberAndSignChecker() {
		Random random = new Random();
		userRandomNumber = random.nextInt((3 - 1) + 1);
		switch (userRandomNumber) {
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
	
}
