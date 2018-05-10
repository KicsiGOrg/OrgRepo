
public enum Tournaments {
	
	TOKYO("Tokyo - Japan Open"),
	BARCELONA("Barcelona - Barcelona Open"),
	LONDON("London - ATP World Tour Finals"),
	PARIS("Paris - Paris Masters");
	
	private String textual;

	private Tournaments(String text) {
		textual = text;
	}

	public String getTextual() {
		return textual;

	}

}
