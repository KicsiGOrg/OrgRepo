import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Name {
	ROGER_FEDERER("Roger Federer"), RAFAEL_NADAL("Rafael Nadal"), 
	NOVAK_ĐOKOVIĆ("Novak Đoković"), PETE_SAMPRAS("Pete Sampras"), 
	ANDRE_AGASSI("Andre Agassi"), BJÖRN_BORG("Björn Borg"), 
	BORIS_BECKER("Boris Becker"), ANDY_RODDICK("Andy Roddick");

	private static final List<Name> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	private String textual;

	private Name(String text) {
		textual = text;
	}

	/**
	 * Olvasható enum megjelenítés
	 * 
	 * @return A getTextual metódus visszaadja az enum value mögé írt értéket.
	 */
	public String getTextual() {
		return textual;
	}

	/**
	 * Random név választó metódus.
	 * 
	 * @return A Name enumból random generál az enum méretéből egy nevet.
	 */
	public static Name randomName() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
