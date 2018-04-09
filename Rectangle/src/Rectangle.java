import java.util.Scanner;

public class Rectangle {

	static Scanner sc;
	static int height;
	static int width;
	
	public static void main(String[] args) {

		getDatas();
		
		String star = "*";
        String stars = new String(new char[width]).replace("\0", star);
        for (int i = 1; i <= height; i++) {
            System.out.println(stars);
        }
		sc.close();
	}

	private static void getDatas() {
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				System.out.print("Adjon meg egy számot, hogy milyen széles legyen a téglalap: ");
				sc = new Scanner(System.in);
				width  = sc.nextInt();
				sc.nextLine();
			}else {
				System.out.print("Adjon meg egy számot, hogy milyen magas legyen a téglalap: ");
				sc = new Scanner(System.in);
				height = sc.nextInt();
				sc.nextLine();
			}
		}
	}
}