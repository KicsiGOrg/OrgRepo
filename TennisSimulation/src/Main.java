import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Üdvözöljük olvasóinkat ezen a jeles Tenisz eseményen.\nAhogy az IP címekből látom összegyűlt a világ színe JAVA :)");
		System.out.println("");

		Random random = new Random();
		Player playerOne = new Player();
		Player playerTwo = new Player();

//		playerOne.setName(new Name());
		playerOne.getName(Names.ANDRE_AGASSI);
		playerTwo.setName(new Name(-----));
		int playerOnePoint = 0;
		int playerOneSet = 0;
		int playerTwoSet = 0;
		int playerTwoPoint = 0;
		int endOfset = 6;
		int i = 1;
		do {
			System.out.println(i + " szett.");
			do {
				int pointOne = random.nextInt(2);
				int pointTwo = random.nextInt(2);
				if (pointOne == pointTwo) {
					continue;
				} else {
					if (pointOne == 0) {
						playerOnePoint++;
					} else {
						playerTwoPoint++;
					}
					if (playerOnePoint != 0) {
						System.out.println(playerOne.getName() + " " + playerOnePoint + " | " + playerTwo.getName()
								+ " " + playerTwoPoint);
					} else {
						System.out.println(playerTwo.getName() + " " + playerTwoPoint + " | " + playerOne.getName()
								+ " " + playerOnePoint);
					}
				}
				if (playerOnePoint == endOfset || playerTwoPoint == endOfset) {
					if (playerOnePoint == endOfset) {
						if (playerOnePoint - 1 == playerTwoPoint) {
							endOfset++;
						} else {
							break;
						}
					} else {
						if (playerTwoPoint - 1 == playerOnePoint) {
							endOfset++;
						} else {
							break;
						}
					}
				}
			} while (playerOnePoint != endOfset && playerTwoPoint != endOfset);
			if(playerOnePoint > playerTwoPoint) {
				playerOneSet++;
			}else {
				playerTwoSet++;
			}
			playerOnePoint = 0;
			playerTwoPoint = 0;
			i++;
		} while (playerOneSet < 3 && playerTwoSet < 3);
		sc.close();
	}
}
