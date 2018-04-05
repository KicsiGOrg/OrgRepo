public class FizzBuzz {
  
    public static void main(String[] args) {
  
        for (int number = 1; number <= 100; number++) {
            if(number % 3 != 0 && number % 5 != 0) {
            System.out.println(number);
            }
            if (number % 3 == 0 && number % 5 != 0) {
                System.out.println(number + " Fizz");
            }
            if(number % 5 == 0 && number % 3 != 0) {
                System.out.println(number + " Buzz");
            }
            if(number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " Fizz Buzz");
            }
        }
    }
}