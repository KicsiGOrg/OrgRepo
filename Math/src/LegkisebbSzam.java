import java.util.Arrays;

public class LegkisebbSzam {

	public static void main(String[] args) {

		int[] tomb = { 335, 433, 68166, 7648, 4643, 2486, 1, 5648 };
		int small = Arrays.stream(tomb).reduce((x, y) -> x < y ? x : y).getAsInt();
		System.out.println(small);
		int big = Arrays.stream(tomb).reduce((x, y) -> x > y ? x : y).getAsInt();
		System.out.println(big);
	}
}
