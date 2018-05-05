import java.util.Scanner;

public class Main {

	static double bmiIndex;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int heightIndex = 0;
		int weightIndex = 1;
		System.out.println("A beírt adatok alapján kiszámolom a testtömeg indexét.");
		double height = GetInput.getInput(sc, "\nKérem adja meg a magasságát: ", heightIndex);
		double weight = GetInput.getInput(sc, "\nKérem adja meg a súlyát: ", weightIndex);
		sc.close();
		Evaluation.evaluation(bmiIndex, weight, height);
	}
}