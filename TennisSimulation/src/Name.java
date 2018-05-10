
public class Name {

	private Names names;
	
	public Names getNames() {
		return names;
	}

	public void setNames(Names names) {
		this.names = names;
	}
	
	public String toString() {
//		return (prefix != null ? prefix.getTextual() + " " : "") + firstName + " " + lastName;
		return (names.getTextual())+"";
	}

}
