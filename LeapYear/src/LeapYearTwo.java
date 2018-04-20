public class LeapYearTwo {

	static boolean leap;

	public static void main(String[] args) {

		welcome();
		int year;
		int max = 1930;

		for (year = 1830; year <= max; year++) {
			leapValidator(year);
			if (leap) {
				System.out.println(year + " szökőév.");
			}
		}
	}

	private static void welcome() {
		System.out.print("Üdvözlöm én a számítógép vagyok.\n"
				+ "A mostani programban azt fogom megvizsgálni, hogy 1880 és 1930 között melyik évszám szökőév-e?");
	}

	private static void leapValidator(int year) {
		if (year >= 1582) {
			if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
				leap = true;
			} else {
				leap = false;
			}
		}
	}
}
