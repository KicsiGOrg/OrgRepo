public class Modulo {

	public static void main(String[] args) {
		int number = 1243;
		int divisor = number % 5;
		int moduloNumber;
		switch (divisor) {
		case 1:
			moduloNumber = number - 1;
			System.out.println("1: " + moduloNumber);
			break;
		case 2:
			moduloNumber = number - 2;
			System.out.println("2: " + moduloNumber);
			break;
		case 3:
			moduloNumber = number + 2;
			System.out.println("3: " + moduloNumber);
			break;
		case 4:
			moduloNumber = number + 1;
			System.out.println("4: " + moduloNumber);
			break;
		case 6:
			moduloNumber = number - 1;
			System.out.println("6: " + moduloNumber);
			break;
		case 7:
			moduloNumber = number - 2;
			System.out.println("7: " + moduloNumber);
			break;
		case 8:
			moduloNumber = number + 2;
			System.out.println("8: " + moduloNumber);
			break;
		case 9:
			moduloNumber = number + 1;
			System.out.println("9: " + moduloNumber);
			break;
		default:
			System.out.println("default: " + number);
			break;
		}
	}
}
