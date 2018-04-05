public class Szilveszter {

    public static void main(String[] args) {

        int[] tomb = new int[11];
        int tombElem = 0;
        for (int i = 0; i <= 10; i++) {
            tomb[i] = tombElem;
            tombElem++;
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(tomb[i]);
        }
        System.out.println("Boldog új évet " + args[0] + "!");
    }
}