import java.util.Scanner;

public class TripleChar {

    public static void main(String[] args){

        System.out.print("Kérem írjon be egy karaktert: ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println(c);

        scanner.close();

    }
}
