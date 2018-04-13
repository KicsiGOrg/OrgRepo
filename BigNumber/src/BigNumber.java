
public class BigNumber {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long number = 0;
		
		for(long i = 0; i <= Long.MAX_VALUE; i++) {
			System.out.println(number);
			number++;
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double seconds = (double)totalTime / 1000000000.0;
		System.out.println(seconds);
	}
}
