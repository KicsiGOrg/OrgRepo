import java.util.Scanner;

public class BB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Szám: ");
        int originalNumber = scanner.nextInt();
        scanner.nextLine();
        sumOfDigitsProcess(originalNumber,digitNumber(originalNumber));
        
        scanner.close();
    }

    public static int digitNumber(int originalNumber) {
        int copyOfNumber = originalNumber;
        int szamjegy = 0;
        do {
            szamjegy++;
            copyOfNumber = copyOfNumber / 10;
        } while (copyOfNumber != 0);
        return szamjegy;
    }

    public static void sumOfDigitsProcess(int originalNumber, int szamjegy) {
        int sumOfDigits = 0;
        for (int i = 0; i< szamjegy-1; i++) {
            sumOfDigits = sumOfDigits + Math.abs(originalNumber - ((int) (originalNumber / 10)) * 10);
            originalNumber = (originalNumber / 10);
        }
        sumOfDigits = sumOfDigits + originalNumber;
        if (digitNumber(sumOfDigits) > 1) {
            sumOfDigitsProcess(sumOfDigits, digitNumber(sumOfDigits));
        } else {
            if (sumOfDigits == 3 || sumOfDigits == 6 || sumOfDigits == 9) {
                System.out.println("Osztható 3-mal");
            }
            else {
                System.out.println("Nem osztható 3-mal");
            }
        }
    }
}