import java.text.DecimalFormat;
import java.util.Scanner;

public class TripleNumberTwo {

    public static void main(String[] args) {

        System.out.print("Kérem adjon meg egy számot: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.nextLine();
        DecimalFormat myFormatter = new DecimalFormat("#.0000");
        double tripleNumber = number * 3;

        System.out.println(myFormatter.format(tripleNumber));

        scanner.close();
    }
}
