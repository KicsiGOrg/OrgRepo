
public class MathPow {
	// Hatványozás

	public static void main(String[] args) {
		int a = 2;
		for (int b = 0; b <= 10; b++) {
			long c = (int) Math.pow(a, b);
			System.out.println(c);
		}
	}
}