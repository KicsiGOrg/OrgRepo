public class HappyBirthdayArgs {

	public static void main(String[] args) {

		System.out.println("Isten éltessen " + args[0]);

		for (int i = 0; i <= args.length - 1; i++)
			
			if (i >= 3) {
				
				System.out.println(args[i]);
			}
	}
}