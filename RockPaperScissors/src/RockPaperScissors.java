import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	/*
	 * Készítsd el a Kő-papír-olló játék konzolos verzióját.
	 * 
	 * KÉSZ - Olvasson be a felhasználótól két nevet
 	 * amikor az adott játékos következik, írja ki neki, hogy ő következik,
 	 * illetve hogy hányadik menetnél járnak, mennyi az állás (kinek hány pontja van, mennyi a döntetlen).
	 * 
	 * Kezdésnél meg lehessen adni, hogy hány kört szeretnének játszani.
	 * 
	 * Lehessen úgy is játékot játszani, hogy kezdésnél azt adják meg, hogy hány
	 * szerzett pontig menjen a játék.
	 * 
	 * Miután a játék véget ért, készítsen statisztikát arról, hány kört nyert az
	 * egyik, illetve másik játékos és hogy mennyi lett a döntetlen.
	 * 
	 * Olyan statisztika is legyen, amelyik kiírja, hogy az egyik, illetve a másik
	 * játékos hányszor játszotta meg a kőt, a papírt, vagy az ollót, és ezek
	 * megjátszása során mennyi volt a győztes, vesztes, döntetlen kör. 
	 * 
	 * Ugyanerről a két játékos összesített statisztikát is írja ki.
	 */

	static int menuIndex;
	static int endOfPoint;
	static int endOfRound;
	static String userNameA;
	static String userNameB;
	static HashMap<Integer, String> setOfValues;
	
	public static void main(String[] args) {

		System.out.println("Kö papír ólló játék.");
		Scanner sc = new Scanner(System.in);

		System.out.println("Menü\n**********************\n1 - Játék a megadott körökig\n2 - Játék a megadott pontszámig\n");
		int round = 1;
		int point = 1;
		int index = 1;
		setHashMapValue();
		index = getPlayerName(sc, index);
		selectFromTheMenu(sc);
		System.out.println("endOfRound: " + endOfRound);
		System.out.println("endOfPoint: " + endOfPoint);
		
		
		switch (menuIndex) {
		case 1:
			for(int i = 0; i < endOfRound; i++) {
				Random random = new Random();
				random.nextInt();
				
				/*
				 * 
				 * Innen kell folytatni!
				 * 
				 */
				
				
				
			}
			break;
		case 2:
			break;
		}
		sc.close();

		
	}

	private static void setHashMapValue() {
		setOfValues = new HashMap<Integer, String>();
		setOfValues.put(1,"Kő");
		setOfValues.put(2,"Papír");
		setOfValues.put(3,"Olló");
	}


	private static int selectFromTheMenu(Scanner sc) {
		do {
		System.out.print("Kérem válasszon a menüből: ");
		menuIndex = sc.nextInt();
		sc.nextLine();
		if(menuIndex != 1 && menuIndex != 2) {
			System.out.println("A megadott menüszám hibás.");
		}
		}while(menuIndex != 1 && menuIndex != 2);
		switch(menuIndex) {
		case 1: 
			System.out.print("Add meg hány körig menjen a játék: ");
			endOfRound = sc.nextInt();
			sc.nextLine();
			break;
		case 2: 
			System.out.print("Add meg hány pontig menjen a játék: ");
			endOfPoint = sc.nextInt();
			sc.nextLine();
			break;
		}
		return menuIndex;
	}

	private static int getPlayerName(Scanner sc, int index) {
		do {
		System.out.print("Kérem adja meg az " + index + " játékos nevét: ");
		if(index == 1) {
			userNameA = sc.nextLine();
			index++;
		}else {
			userNameB = sc.nextLine();
			index++;
		}
		}while (index != 3);
		return index;
	}

}
