
public class Player {
	
	private Name name;
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
        return name + " (" + getName() + ")";
    }
}
