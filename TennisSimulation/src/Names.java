
public enum Names {
	ROGER_FEDERER("Roger Federer"), RAFAEL_NADAL("Rafael Nadal"), 
	NOVAK_ĐOKOVIĆ("Novak Đoković"), PETE_SAMPRAS("Pete Sampras"), 
	ANDRE_AGASSI("Andre Agassi"), BJÖRN_BORG("Björn Borg"), 
	BORIS_BECKER("Boris Becker"), ANDY_RODDICK("Andy Roddick");

	private String textual;

	private Names(String text) {
		textual = text;
	}

	public String getTextual() {
		return textual;

	}
}
