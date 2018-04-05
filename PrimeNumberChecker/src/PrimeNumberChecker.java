import java.util.Scanner;
 
public class PrimeNumberChecker {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A megadott szám: " + number);
        if (isPrime(number)) {
            System.out.println("Ez egy prímszám.");
        } else {
            System.out.println("Ez egy összetett szám.");
        }
        scanner.close();
    }
 
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int possibleDivisor = 2; possibleDivisor < number; possibleDivisor++) {
            if (number % possibleDivisor == 0) {
                return false;
            }
        }
        return true;
    }
 
}