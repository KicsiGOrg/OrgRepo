import java.util.Random;

public class GameTwo {

	static Random random = new Random();
	
	public static void game(Player playerOne, Player playerTwo) {
		int playerOnePoint = 0;
		int playerOneSet = 0;
		int playerTwoSet = 0;
		int playerTwoPoint = 0;
		int endOfset = 6;
		int i = 1;
		do {
			System.out.format("\n          %d szett.\n\n", i);
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
					System.out.println(playerOne.getName().getTextual() + " " + playerOnePoint + " | "
							+ playerTwo.getName().getTextual() + " " + playerTwoPoint);
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
			if (playerOnePoint > playerTwoPoint) {
				playerOneSet++;
			} else {
				playerTwoSet++;
			}
			if (playerOnePoint > playerTwoPoint) {
				System.out.println("\n " + playerOne.getName().getTextual() + " nyerte a szettet.");
			} else {
				System.out.println("\n " + playerTwo.getName().getTextual() + " nyerte a szettet.");
			}
			playerOnePoint = 0;
			playerTwoPoint = 0;
			endOfset = 6;
			i++;
		} while (playerOneSet < 3 && playerTwoSet < 3);
		Printer.printWinner(playerOne, playerTwo, playerOneSet, playerTwoSet);
	}
	
}
