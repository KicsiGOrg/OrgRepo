import java.util.ArrayList;
import java.util.Random;

public class Main {

	static ArrayList<String> playerList = new ArrayList<>();
	static Player[] pairs;

	public static void main(String[] args) {

		playerList.add("Elso");
		playerList.add("Masodik");
		playerList.add("Harmadik");
		playerList.add("Negyedik");
		playerList.add("Ötödik");
		playerList.add("Hatodik");
		playerList.add("Hetedik");
		playerList.add("Nyolcadik");
		do {
			pairs = sorsolas();
			for (Player playerName : pairs) {
				System.out.print(playerName.getPlayerName() + "  ");
			}
			System.out.println();
			eredmeny((meccs(pairs, "sp")));
			break;
		} while (playerList.size() > 1);
	}

	static void eredmeny(Player player) {
		player.addWinSetPoint();
		pairs[0].setWinPoint(0);
		pairs[0].setWinTiePoint(0);
		pairs[1].setWinPoint(0);
		pairs[1].setWinTiePoint(0);
		if (!(player.getWinSet() == 3)) {
			eredmeny(meccs(pairs, "sp"));
		} else {
			System.out.println("Nyertes: " + player.getPlayerName());
		}
	}

	static Player[] sorsolas() {
		Player[] parositas = new Player[2];
		for (int i = 0; i <= 1; i++) {
			parositas[i] = new Player(playerList.get(new Random().nextInt(playerList.size())));
			playerList.remove(parositas[i].getPlayerName());
		}
		return parositas;
	}

	static Player meccs(Player[] parositas, String tipus) {
		Player winner;
		do {
			parositas[new Random().nextInt(2)].addPoint(tipus);
		} while (parositas[0].getWinPoint(tipus) < (tipus.equals("tb") ? 7 : 6)
				&& parositas[1].getWinPoint(tipus) < (tipus.equals("tb") ? 7 : 6));
		if (Math.abs(parositas[0].getWinPoint(tipus) - parositas[1].getWinPoint(tipus)) >= 2) {
			System.out
					.println(
							tipus.equals("tb")
									? (parositas[0].getWinTiePoint() > parositas[1].getWinTiePoint() ? "7" : "6")
											+ " - "
											+ (parositas[0].getWinTiePoint() > parositas[1].getWinTiePoint() ? "6"
													: "7")
											+ "\n" + parositas[0].getWinPoint(tipus) + " : "
											+ parositas[1].getWinPoint(tipus)
									: parositas[0].getWinPoint(tipus) + " - " + parositas[1].getWinPoint(tipus));
			return winner = parositas[0].getWinPoint(tipus) == (tipus.equals("tb") ? 7 : 6) ? parositas[0]
					: parositas[1];
		} else {
			if (parositas[0].getWinPoint(tipus) == parositas[1].getWinPoint(tipus)) {
				return meccs(parositas, "tb");
			} else {
				parositas[new Random().nextInt(2)].addPoint(tipus);
				if (Math.abs(parositas[0].getWinPoint(tipus) - parositas[1].getWinPoint(tipus)) >= 2) {
					System.out.println(
							tipus.equals("tb")
									? (parositas[0].getWinTiePoint() > parositas[1].getWinTiePoint() ? "7" : "6")
											+ " - "
											+ (parositas[0].getWinTiePoint() > parositas[1].getWinTiePoint() ? "6"
													: "7")
											+ "\n" + parositas[0].getWinPoint(tipus) + " : "
											+ parositas[1].getWinPoint(tipus)
									: parositas[0].getWinPoint(tipus) + " - " + parositas[1].getWinPoint(tipus));
					return winner = parositas[0].getWinPoint(tipus) == (tipus.equals("tb")
							? Math.max(parositas[0].getWinPoint(tipus), parositas[1].getWinPoint(tipus))
							: 7) ? parositas[0] : parositas[1];
				} else {
					return meccs(parositas, "tb");
				}
			}
		}
	}
}
