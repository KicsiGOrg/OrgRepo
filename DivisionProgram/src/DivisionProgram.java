import java.util.Scanner;

/*
 * Csak olyan számok osztására jó, ami nem törtben végződik. 10/3 = 4 Aprogram szerint ... 
 * A while ciklust lehet át kell írni Do While-ra ..... 
 */


public class DivisionProgram {

	public static void main(String[] args) {
		int a, b, c, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter first number: ");
		a = sc.nextInt();
		sc.nextLine();
		System.out.print(" Enter second number: ");
		b = sc.nextInt();
		sc.nextLine();
		c = a + b;
		
		while(c > b) {
			c = c - b;
			result++;
		}
		System.out.println("The result is: " + result);
		sc.close();
	}

}
