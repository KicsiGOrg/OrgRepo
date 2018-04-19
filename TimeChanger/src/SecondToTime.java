import java.util.Scanner;

public class SecondToTime {

	static Scanner sc = new Scanner(System.in);
	static int second;
	
	static void time(int mp) {
		int second = mp;
		int hour = second / 3600;
		second %= 3600;
		int minute = second / 60;
		second %= 60;
		System.out.println(mp + " másodperc -> óra:perc:másodperc = " + hour + ":" + minute + ":" + second);
	}

	public static void main(String[] args) {
		
		getSecond();
		sc.close();
		time(second);
	}
	private static void getSecond() {
		do {
		System.out.print("Kérem adja meg a vizsgálandó idő másodpercben: ");
		second = sc.nextInt();
		sc.nextLine();
			if(second <= 0) {
				System.out.println("A megadott szám túl kicsi, 0-nál nagyobb számot adjon meg.");
			}
		}while(second <= 0);
	}
}
