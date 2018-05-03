
public class MathematicalCalculation {

	public static void eulersLine(int input) {
		System.out.print("Euler féle sor alapján a \u03C0\u00b2 / 6 közelítő értéke = ");
		double a = 0.0;
		for (int i = 2; i <= input + 1; i++) {
			a = a + (1 / Math.pow(i, 2));
		}
		a = a + 1.0;
		System.out.print(a);
	}

	public static void vietleLine(int input) {
		System.out.print("\nViètel féle sor alapján a 2 / \u03C0 közelítő értéke = ");
		double counter = Math.sqrt(2.0);
		double a = 0.0;
		for (int i = 1; i <= input; i++) {
			if(i== 1) {
				a = (counter/2);
			}else {
				a = (a) * (Math.sqrt(2.0 + counter)/2);
			}
		}
		System.out.println(a);
	}
}
