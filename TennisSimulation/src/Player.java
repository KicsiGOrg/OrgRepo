
public class Player {
	
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
	
	public static void creatPlayer(Player playerOne, Player playerTwo) {
		do {
			playerOne.setName(Name.randomName());
			playerTwo.setName(Name.randomName());
		}while(playerOne.equals(playerTwo));		
	}
}
