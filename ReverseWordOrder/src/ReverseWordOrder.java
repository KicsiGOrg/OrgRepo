import java.util.Scanner;

public class ReverseWordOrder {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] array = new String[10];
		String str;
		int i = 0;
		System.out.println("Szöveg kiíratás fordított sorrendben.\n");
		do {
			System.out.print("Kérem adjon meg szavakat: ");
			str = sc.nextLine();
			array[i] = str;
			i++;
		} while (!str.equals(""));
		sc.close();

		for (int j = array.length - 1; j >= 0; j--) {
			if (array[j] != null && !array[j].equals("")) {
				System.out.println(array[j]);
			}
		}
	}
}
