import java.util.Scanner;
import java.util.Arrays;

public class Reservoir {

	static int number;
	static int zero = 0;
	static int ten = 10;

	public static void main(String[] args) {

		char[][] reservoirArray = new char[10][10];
		int[] reservoirInt = new int[10];

		System.out.println("Üdvözlöm én a számítógép vagyok. \nA mostani programmal kiszámoljuk egy víztároló kapacitását.\n ");
		System.out.println("               MENÜSOR\n***********************************\n1 - Ha Ön szeretne adatokat megadni\n2 - Véletlen szám generálás ");
		Scanner sc;
		int userResponse;

		do {
			System.out.print("\nKérem válasszon a menübõl: ");
			sc = new Scanner(System.in);
			userResponse = sc.nextInt();
			sc.nextLine();

			switch (userResponse) {
			case 1:
				userFiller(reservoirInt, sc);
				break;
			case 2:
				randomFiller(reservoirInt, zero, ten);
				break;
			default:
				System.out.println("Téves menüpont!");
				break;
			}
			fieldCreator(reservoirArray, reservoirInt); // A terep felöltése a megadott számok alapján
			fieldPlotter(reservoirArray); 				// A terep kirajzolása

		} while (userResponse != 1 && userResponse != 2);
		System.out.println("\nKöszönöm, hogy igénybe vette a szolgáltatásaimat.\nViszont látásra.");
		sc.close();
	}

	private static void fieldPlotter(char[][] reservoirArray) {
		for (int j = 0; j < reservoirArray.length; j++) {
			System.out.println(reservoirArray[j]);
		}
	}

	private static void fieldCreator(char[][] reservoirArray, int[] reservoirInt) {
		for (int i = 0; i < reservoirArray.length; i++) {
			for (int j = reservoirArray.length - reservoirInt[i]; j < reservoirInt.length; j++) {
				reservoirArray[j][i] = '*';
			}
		}
	}

	private static void randomFiller(int[] reservoirInt, int zero, int ten) {
		System.out.println("\nVéletlen számokkal töltöm fel a víztározót!\n");
		for (int i = 0; i < reservoirInt.length; i++) {
			number = (int) (Math.random() * (ten - zero + 1)) + zero;
			reservoirInt[i] = number;
		}
	}

	private static void userFiller(int[] reservoirInt, Scanner sc) {
		System.out.println("\nÖn tölti fel a víztározó tömböt adatokkal!\nKérem adjon meg 0 - 10 közötti számokat a talaj mintázatához.\n");
		for (int i = 0; i < reservoirInt.length; i++) {
			int f = i + 1;
			System.out.print(f + ": ");
			number = sc.nextInt();
			if (number > 10 || number < 0) {
				System.out.println("Na na, ne csaljunk :) ");
				i = i - 1;
			} else {
				reservoirInt[i] = number;
			}
		}
	}

}
