public class TimePeriodFromSecondToTime {

	static void timePeriod(int sec) {
		int second = sec;
		int hour = second / 3600;
		second%=3600;
		int minute = second / 60;
		second%=60;
		System.out.println(sec+" másodperc = " + hour + ":" + minute + ":" + second);
	}
	
	public static void main(String[] args) {
		System.out.println("Időtartam: "+ "másoperc -> óra:perc:másodperc");
		timePeriod(11502);
	}
}