
public class Player {
	
	String[] array = {"Roger Federer","Rafael Nadal","Novak Đoković","Pete Sampras","Andre Agassi","Björn Borg","Boris Becker", "Andy Roddick"};

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name string) {
		this.name = string;
	}

	public int generateName() {
		return 0;
	}

	@Override
	public String toString() {
		return name + " (" + getName() + ")";
	}

	/**
	 * Játékos létrehozás
	 * 
	 * @param playerOne
	 * @param playerTwo
	 * 
	 *            A generálás addig megy, amíg nem azonos nevű játékosnevet sorsol a
	 *            random függvény.
	 */
	public static void creatPlayer(Player playerOne, Player playerTwo) {
		do {
			playerOne.setName(Name.randomName());
			playerTwo.setName(Name.randomName());
		} while (playerOne.equals(playerTwo));
	}
}
