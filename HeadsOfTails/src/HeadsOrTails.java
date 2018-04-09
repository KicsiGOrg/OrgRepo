public class HeadsOrTails {

	public static void main(String[] args) {

		int head = 0;
		int tail = 0;
		
		for(int i = 0; i < 1000; i++) {
			int number = (int) (Math.random() * (1 - 0 + 1)) + 0;
			if(number == 0) {
				head++;
			}else {
				tail++;
			}
		}
		System.out.println("1000 feldobás eredménye:\nFej: "+ head+ "\nÍrás: "+ tail);
	}
}