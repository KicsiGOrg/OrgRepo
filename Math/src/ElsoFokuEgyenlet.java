
public class ElsoFokuEgyenlet {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;

		if (a == 0) {
			System.out.println("0-val Tilos osztani");

		} else {
			double x = -b / a;
			if (a * x + b == 0) {
				System.out.println(x + " = " + "-" + b + " / " + a);
				System.out.println("Az X = " + x);
			} else {
				System.out.println(x + " = " + "-" + b + " / " + a);
				System.out.println("Az X = " + x);

			}
		}

	}

}
