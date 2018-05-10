
public class Main {

	static int[] array = new int[200];
	static int[] counters = new int[9];
	public static void main(String[] args) {
		System.out.println("A program célja egy " + array.length + " elemű tömbben tárolt kétjegyű számok tízesével történő csoportosítása.\n");
		array = Filler.fillTheArray(array, counters);
		Printer.printArray(array);
		Printer.counter(counters);
	}
}
