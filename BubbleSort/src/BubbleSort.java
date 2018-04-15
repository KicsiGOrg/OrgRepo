
public class BubbleSort {

	public static void main(String[] args) {

		int temp;
		int[] numbers = { 82, 3000, 13, -2, 83, 666, 0, 70, 10, 84 };
		
		printArray(numbers);
		System.out.println("\n--------------------------------------------------");
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 9; i > 0; i--) {
				if (numbers[i] < numbers[i - 1]) {
					temp = numbers[i - 1];
					numbers[i - 1] = numbers[i];
					numbers[i] = temp;
					temp = 0;
				}
			}
		}
		printArray(numbers);
	}

	private static void printArray(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			if(i == numbers.length-1) {
				System.out.print(numbers[i]);
			}else {
				System.out.print(numbers[i] + " - ");
			}
		}
	}
}
