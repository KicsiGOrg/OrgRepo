
public class Information {

	public static void menu() {
		System.out.println("SZÁMOLÓGÉP MENÜSOR\n" + "------------------\n" + "1 - Összeadás\n" + "2 - Kivonás\n"
				+ "3 - Szorzás\n" + "4 - Osztás\n" + "5 - Kilépés\n");
	}
	
	public static void greeting() {
		System.out.println("Üdvözlöm én a számológép vagyok!\n");
	}
	
	public static void SayBye() {
		System.out.println("Köszönöm, hogy igénybe vette a szolgáltatásaimat. \nViszont látásra!");
	}
	
	public static void result (String message, double numberC) {
		System.out.println(message + numberC + "\n");
	}

}
