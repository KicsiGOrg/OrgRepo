public class FibonacciNumbers {

    public static void main(String[] args){
        int N1 = 0;
        int N2 = 1;

            System.out.println(N1);
            System.out.println(N2);

        for (int i = 2; i <= 20; i++) {
         int N3 = N1 + N2;
         N1 = N2;
         N2 = N3;
         System.out.println(N3);
        }
    }
}
