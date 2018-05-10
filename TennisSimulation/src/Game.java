import java.util.Random;

public class Game {
	
	static Random random = new Random();
	
	public static void game(Player playerOne, Player playerTwo) {
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
	}
}
