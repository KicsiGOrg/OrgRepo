
public enum NamePrefix {
	DOCTOR("Dr."), JUNIOR("Jr."), SENIOR("Sr."), PROFESSOR("Prof."), SIR("Sir"), LORD("Lord");

	private String textual;

	private NamePrefix(String text) {
		textual = text;
	}
	
	public String getTextual() {
		return textual;
	}
}
