import java.util.Scanner;

public class TripleNumberOne {

    public static void main(String[] args){

        System.out.print("Kérem adjon meg egy számot: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        int tripleNumber = number * 3;

        System.out.println(tripleNumber);

        scanner.close();

    }
}
