import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("n! kiszámítása");
        System.out.print("Kérem adjon meg egy számot: ");
        Scanner number = new Scanner(System.in);
        long n = number.nextLong();
        long f = 1;
        number.nextLine();

        for (long i = 1; i <= n; i++)
            f *= i;
        System.out.println(n + "! = " + f);
        number.close();
    }
}