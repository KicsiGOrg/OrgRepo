import java.util.Scanner;

public class LengthUnitConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hosszmértékegység átváltó program.\n");
		System.out.print("Kérem adja meg a számot: ");
		double number = sc.nextDouble();
		sc.nextLine();
		sc.close();
	
	System.out.format("%.2f mm%n", number * 1000.0 );
	System.out.format("%.2f cm%n", number * 100.0 );
	System.out.format("%.2f dm%n", number * 10.0 );
	System.out.format("%.2f  m%n", number );
	System.out.format("%.2f km%n", number / 0.001 );
	System.out.format("%.2f ft%n", number * 3.28);
	System.out.format("%.2f yd%n", number * 1.0936);
	System.out.format("%.2f mi%n", number * 0.00062137);
	}
}