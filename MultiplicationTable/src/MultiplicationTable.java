public class MultiplicationTable {

	public static void main(String[] args) {

		int[]table = {1,2,3,4,5,6,7,8,9,10};
		for (int i : table) {			
			for(int j = 0; j < table.length; j++) {
				int number = i * table[j];
				System.out.print(number + " ");
				if(j == 9) {
					System.out.println("");
				}
			}
		}
	}
}