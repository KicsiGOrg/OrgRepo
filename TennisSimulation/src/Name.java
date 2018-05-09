
public class Name {

	private NamePrefix prefix;
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//alt + shift + s lenyíló menüben Generate Constructor using Fields ...
	public Name(NamePrefix prefix, String firstName, String lastName) {
		this.prefix = prefix;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public NamePrefix getPrefix() {
		return prefix;
	}

	public void setPrefix(NamePrefix prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return (prefix != null ? prefix.getTextual() + " " : "") + firstName + " " + lastName;
	}

}
