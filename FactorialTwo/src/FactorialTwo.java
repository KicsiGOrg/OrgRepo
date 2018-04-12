import java.util.Scanner;

public class FactorialTwo {
	
	static Scanner sc;
	static long factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n - 1);
	}

	public static void main(String[] args) {

		System.out.println("n! kiszámítása");
		sc = new Scanner(System.in);
		System.out.print("Adjon meg egy számot: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n >= 0) {
			System.out.println(n+"! = " + factorial(n));
		}else {
			System.out.println("Negatív számnak nincs faktoriálisa!");
		}
		
		sc.close();
		
	}
}