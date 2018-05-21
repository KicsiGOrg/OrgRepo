import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Tournaments {
	
	TOKYO("Tokyoból a Japan Openning-ről."),
	BARCELONA("Barcelonából a Barcelona Openning-ről."),
	LONDON("Londonból az ATP World Tour Finals-ről."),
	PARIS("Párizsból a Paris Masters-ről.");
	
	private String textual;
	
	private static final List<Tournaments> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Tournaments randomLocation() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

	private Tournaments(String text) {
		textual = text;
	}
	
	public String getTextual() {
		return textual;
	}
}
