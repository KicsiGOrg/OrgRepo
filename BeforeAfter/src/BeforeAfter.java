import java.util.Scanner;

public class BeforeAfter {

	/*
	 * A program egy eljárása paraméterként kap egy main() metódusban beolvasott
	 * számot. Az eljárás írja ki a számot megelőző és követő számot a konzolra.
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("A program feladata a megadott szám előtti és utáni szám megtalálása/kiírása.");
		System.out.print("Kérem adjon meg egy számot: ");
		int number = sc.nextInt();
		sc.nextLine();
		sc.close();
		printBeforAndAfterNumber(number);
	}

	private static void printBeforAndAfterNumber(int number) {
		int beforeNumber = number - 1;
		int afterNumber = number + 1;
		System.out.println("A(z) " + number + " előtti szám= " + beforeNumber);
		System.out.println("A(z) " + number + " utáni szám= " + afterNumber);
	}

}
