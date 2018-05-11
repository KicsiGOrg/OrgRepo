
public class Player {

	private String playerName;
	private int winPoint;
	private boolean winMatch;
	private int winTiePoint;
	private int winSet;

	public int getWinPoint(String tipus) {
		if (tipus.equals("sp")) {
			return winPoint;
		} else {
			return winTiePoint;
		}
	}

	public void setWinTiePoint(int winTiePoint) {
		this.winTiePoint = winTiePoint;
	}

	public boolean isWinMatch() {
		return winMatch;
	}

	public void setWinMatch(boolean winMatch) {
		this.winMatch = winMatch;
	}

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void addPoint(String tipus) {
		if (tipus.equals("sp")) {
			this.winPoint = winPoint + 1;
		} else {
			this.winTiePoint = winTiePoint + 1;
		}
	}

	public int getWinSet() {
		return winSet;
	}

	public void setWinSet(int winSet) {
		this.winSet = winSet;
	}

	public void addWinTiePoint() {
		this.winTiePoint = winTiePoint + 1;
	}

	public int getWinTiePoint() {
		return winTiePoint;
	}

	public void addWinSetPoint() {
		this.winSet = winSet + 1;
	}

	public void setWinPoint(int winPoint) {
		this.winPoint = winPoint;
	}

}
