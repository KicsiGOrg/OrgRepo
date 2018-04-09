public class PrimeNumberValidator {

	public static void main(String[] args) {

		int db = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (isPrime(i) == true) {
				System.out.println(db + " - " + i);
				db++;
			}
		}

	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < Math.sqrt(number); possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}

}
