import java.util.Scanner;

public class RectangleCalculator {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Hello!");
		System.out.print("Kérem adja meg a téglalap \"a\" oldalának hosszát [m]: ");
		double sideA = sc.nextDouble();
		sc.nextLine();
		System.out.print("Kérem adja meg a téglalap \"b\" oldalának hosszát [m]: ");
		double sideB = sc.nextDouble();
		sc.nextLine();
		sc.close();

		double area = sideA * sideB;
		double circumference = 2 * (sideA + sideB);

		System.out.println("A téglalap kerülete: " + circumference + "[m]");
		System.out.println("A téglalap területe: " + area + "[m\u00B2]");
	}
}