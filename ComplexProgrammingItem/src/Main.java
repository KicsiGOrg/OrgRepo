import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int menuNumber = Menu.menu(sc);
		switch (menuNumber) {
		case 1:
			Copy.arrayCopy(sc);
			break;
		case 2:
			Sorting.sorting(sc);
			break;
		case 3:
			Assortment.assortment(sc);
			break;
		}
	}
}