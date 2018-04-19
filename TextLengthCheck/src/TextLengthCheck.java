import java.util.Scanner;
 
public class TextLengthCheck {
 
    static Scanner sc = new Scanner(System.in);
    static int number;
    static String text;
    static int textLength;
    static String quit;
    static int quitLength;
     
    public static void main(String[] args) {
 
        System.out.println("A program célje egy szöveg hosszának ellenőrzése.");
        getNumber();
        checkLength();
        quitProgram();
        sc.close();
        System.out.println("Köszönöm, öröm volt Önnel együtt dolgozni.\nViszontlátásra.");
    }
 
    private static void quitProgram() {
        System.out.println("A program elvégezte a funkcióját.");
        do {
            System.out.print("A kilépéshez nyomjon entert.");
            String quit = sc.nextLine();
            quitLength = quit.length();
            if(quitLength != 0) {
                System.out.print("A megadott választ nem értem.\nKérem ismételje meg.\n");
            }
        }while(quitLength != 0);
    }
 
    private static void checkLength() {
        do {
            System.out.print("Kérem adja meg a vizsgálandó szöveget: ");
            text = sc.nextLine();
            textLength = text.length();
            if (number == textLength) {
                System.out.println("A megadott szöveg hossza valóban " + number + " karakter.");
            } else {
                System.out.print(
                        "A szöveg hossza nem egyezik meg a megadott számmal. \nKérem adja meg újra a szöveget.\n");
            }
        } while (number != textLength);
    }
 
    private static void getNumber() {
        do {
            System.out.print("Kérem adjon meg egy 0-nál nagyobb számot: ");
            number = sc.nextInt();
            sc.nextLine();
            if (number <= 0) {
                System.out.println("Hibás szám.");
            }
        } while (number <= 0);
    }
}