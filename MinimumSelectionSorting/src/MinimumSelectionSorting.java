public class MinimumSelectionSorting {

    public static void main(String[] args) {
        int[] numbers = { 82, 3000, 13, -2, 83, 666, 0, 70, 10, 84 };
        printArray(numbers);
		System.out.println("\n--------------------------------------------------");
        for (int i = 0; i < numbers.length - 1; i++) {
            int indexOfMinimum = i;
            int minimum = numbers[indexOfMinimum];
            for (int j = i + 1; j < numbers.length; j++) {
                if (minimum > numbers[j]) {
                    minimum = numbers[j];
                    indexOfMinimum = j;
                }
            }
            swapElements(numbers, i, indexOfMinimum);
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
    
    private static void swapElements(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}