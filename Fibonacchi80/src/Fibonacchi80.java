public class Fibonacchi80 {

	public static void main(String[] args) {

		long n1 = 0;
		long n2 = 1;
		long n3;
		
		for (int i = 0; i <= 80; i++) {
			n3 = n1 + n2;
			if(i == 0) {
				System.out.println(i + " - " + n1);
			}
			else if (i == 1) {
				System.out.println(i + " - " + n2);				
			}
			else {
				System.out.println(i + " - " + n3);
				n1 = n2;
				n2 = n3;
			}
		}
	}
}