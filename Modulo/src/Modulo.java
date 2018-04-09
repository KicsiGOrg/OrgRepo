import java.util.Scanner;

public class Modulo {

	static Scanner sc;
	static int number;

	public static void main(String[] args) {

		getNumber();
		moduloMethod(number);
		sc.close();
	}

	private static void getNumber() {
		System.out.print("Kérem adjon meg egy számot, amit öttel oszthatóra kerekítek: ");
		sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.nextLine();
	}

	private static void moduloMethod(int number) {
		int divisor = number % 5;
		int moduloNumber;
		switch (divisor) {
		case 1:
			moduloNumber = number - 1;
			System.out.println(moduloNumber);
			break;
		case 2:
			moduloNumber = number - 2;
			System.out.println(moduloNumber);
			break;
		case 3:
			moduloNumber = number + 2;
			System.out.println(moduloNumber);
			break;
		case 4:
			moduloNumber = number + 1;
			System.out.println(moduloNumber);
			break;
		case 6:
			moduloNumber = number - 1;
			System.out.println(moduloNumber);
			break;
		case 7:
			moduloNumber = number - 2;
			System.out.println(moduloNumber);
			break;
		case 8:
			moduloNumber = number + 2;
			System.out.println(moduloNumber);
			break;
		case 9:
			moduloNumber = number + 1;
			System.out.println(moduloNumber);
			break;
		default:
			System.out.println("default: " + number);
			break;
		}
	}
}
