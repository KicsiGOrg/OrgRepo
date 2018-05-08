
public class MathematicalCalculation {

	public static void eulersLine(int input) {
		System.out.println("------------------Euler féle sor-------------------");
		System.out.println("\u03C0\u00b2 / 6 = 1,644934066848226436472415166646");
		double denominator = 2.0;
		double a = 0.0;
		for (int i = 0; i < input; i++) {
			a = a + (1 / Math.pow(denominator, 2));
			denominator++;
		}
		a = a + 1.0;
		System.out.println("Euler féle sor alapján a közelítő érték \u2243 " + a);
	}

	public static void vietleLine(int input) {
		System.out.print("\nViètel féle sor alapján a 2 / \u03C0 közelítő értéke = ");
		double counter = Math.sqrt(2.0);
		double a = 0.0;
		for (int i = 1; i <= input; i++) {
			if (i == 1) {
				a = counter;
			} else {
				a = ((a) * (Math.sqrt(2.0 + counter)));
			}
		}
		a = a / (Math.pow(2, input));
		System.out.print(a);
	}
	public static void liebniz(int input) {
		System.out.println("\n---------------Liebniz féle sor----------------");
		System.out.println("\u03C0 / 4 = 0,78539816339744830961566084581988");
		double denominator = 3.0;
		double a = 0.0;
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0) {
				a = a - (1 / denominator);
				denominator+=2;
			}else {
				a = a + (1.0 / denominator);
				denominator+=2;
			}
		}
		a = 1 - a;
		System.out.println("Liebniz féle sor alapján a közelítő érték \u2243 " + a);
	}
}
