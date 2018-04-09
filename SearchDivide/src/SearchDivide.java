import java.util.Scanner;

public class SearchDivide {

	static Scanner sc;
	static int number;
	
	public static void main(String[] args) {

		getNumber();
		
		if (isPrime(number)) {
			System.out.println("A(z) " + number + " Prím szám, a legkisebb osztója 1 a legnagyobb " + number);
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
						System.out.println("A(z) " + number + " legkisebb osztója: " + i);
						break;
				}
			}
			if (number < 0) {
				int negativeNumber = number * (-1);
				for (int i = negativeNumber - 1; i < negativeNumber; i--) {
					if (negativeNumber == 1) {
						System.out.println("Az -" + negativeNumber + " legkisebb és legnagyobb osztója önmaga.");
						break;
					} else if (negativeNumber % i == 0) {
						System.out.println("A(z) -" + negativeNumber + " legnagyobb osztója: -" + i);
						break;
					}
				}
				for (int i = 2; i < negativeNumber; i++) {
					if (negativeNumber % i == 0) {
						System.out.println("A(z) -" + negativeNumber + " legkisebb osztója: -" + i);
						break;
					}
				}
			}
			for (int i = number - 1; i < number; i--) {
				if (number == 1) {
					System.out.println("Az " + number + " legkisebb és legnagyobb osztója önmaga.");
					break;
				} else if (number == 0) {
					System.out.println("A megadott szám a 0.");
					break;

				} else if (number % i == 0) {
					System.out.println("A(z) " + number + " legnagyobb osztója: " + i);
					break;
				}
			}
		}
		sc.close();
	}

	private static void getNumber() {
		sc = new Scanner(System.in);
		System.out.println("Tudjuk meg egy szám legkisebb és legnagyobb osztóját!");
		System.out.print("Kérem írjon be egy számot: ");
		number = sc.nextInt();
		sc.nextLine();
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < number; possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}
}
