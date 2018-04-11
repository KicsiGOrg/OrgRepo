public class TwoDigitEvenNumbers {

	public static void main(String[] args) {
		int piece = 0;
		for (int i = 10; i < 100; i += 2) {
			piece++;
		}
		System.out.println(piece + " db páros szám van.");
	}
}