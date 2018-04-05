
public class ForEachLoop {

	public static void main(String[] args) {

		String[][] names = { 
				{ "Kati", "Mari", "Pali", "Laci" }, 
				{ "10", "12", "13", "13" } 
				};

		for (String[] name : names) { //Megadok egy változó nevet, amire a : után hivatkozok a tömb nevével
			for (String anNames : name) { //Megadok egy változó nevet, amivel hivatkozok az egy sorral fentebbi új tömbre (EZ ITT MÁR NEM TÖMB!!!!)
				System.out.println(anNames); // Az egy sorral fentebb lévő változóra hivatkozok
			}
		}
	}
}