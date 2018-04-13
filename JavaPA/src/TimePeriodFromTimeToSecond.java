public class TimePeriodFromTimeToSecond {

	static int timePeriod(int hour, int minute, int second) {
		return hour*3600+minute*60+second;
	}
	
	public static void main(String[] args) {
		System.out.println("Időtartam: óra:perc:másodperc -> másodperc");
		System.out.println("3:11:42 = " + timePeriod(3, 11, 42) +" másodperc");
	}
}