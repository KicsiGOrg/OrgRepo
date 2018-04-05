import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		System.out.print("Adjon meg egy számot, hogy milyen széles legyen a téglalap: ");
		Scanner widthScanner = new Scanner(System.in);
		int width  = widthScanner.nextInt();
		widthScanner.nextLine();
		System.out.print("Adjon meg egy számot, hogy milyen magas legyen a téglalap: ");
		Scanner heightScanner = new Scanner(System.in);
		int height = heightScanner.nextInt();
		heightScanner.nextLine();
		
		String star = "*";
        String stars = new String(new char[width]).replace("\0", star);
        for (int i = 1; i <= height; i++) {
            System.out.println(stars);
        }
		
		widthScanner.close();
		heightScanner.close();
	}

}
