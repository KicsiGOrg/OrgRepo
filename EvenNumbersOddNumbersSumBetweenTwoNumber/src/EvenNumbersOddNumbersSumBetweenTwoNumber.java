import java.util.Scanner;

public class EvenNumbersOddNumbersSumBetweenTwoNumber {

	static Scanner sc;
	static int numberA;
	static int numberB;
	static int numberASum = 0;
	static int numberAPiece = 0;
	static int numberBSum = 0;
	static int numberBPiece = 0;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.print("Kérem adja meg az első számot: ");
		numberA = sc.nextInt();
		sc.nextLine();
		System.out.print("Kérem adja meg a második számot: ");
		numberB = sc.nextInt();
		sc.nextLine();
		sc.close();

		if (numberA == numberB || numberA == numberB+1 || numberA == numberB-1 || numberB == numberA + 1 || numberB == numberA - 1 ) {
			System.out.println("A megadott számok között nincs egész szám.");
		} else {
			if (numberA > numberB) {
				for (int i = numberA-1; i > numberB; i--) {
					if (i % 2 == 0) {
						numberASum = numberASum + i;
						numberAPiece++;
					} else {
						numberBSum = numberBSum + i;
						numberBPiece++;
					}
				}
			} else {
				for (int i = numberB-1; i > numberA; i--) {
					if (i % 2 == 0) {
						numberASum = numberASum + i;
						numberAPiece++;
					} else {
						numberBSum = numberBSum + i;
						numberBPiece++;
					}
				}
			}
			System.out.println(numberA + " és " + numberB + " között " + numberAPiece + " páros és " + numberBPiece
					+ " páratlan szám van.\nPáros számok összege: " + numberASum + "\nPáratlan számok összege: "
					+ numberBSum);
		}
	}
}
