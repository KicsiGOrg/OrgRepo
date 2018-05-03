public class PiApproach {

	static int number = 0;

	public static void main(String[] args) {
		WelcomeAndGetNumber.welcome();
		int input = WelcomeAndGetNumber.getNumber();
		MathematicalCalculation.eulersLine(input);
		MathematicalCalculation.vietleLine(input);
	}
}
