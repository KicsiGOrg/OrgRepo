public class Torpedo {

    public static void main(String[] args) {

        String[][] tomb = {
                {" - ", " - ", " - ", " - ", " - ", " - ", " * ", " - ", " * ", " -\n"},
                {" - ", " - ", " - ", " - ", " - ", " - ", " * ", " - ", " - ", " -\n"},
                {" - ", " - ", " - ", " - ", " - ", " - ", " * ", " - ", " - ", " -\n"},
                {" - ", " - ", " - ", " * ", " * ", " - ", " - ", " - ", " * ", " *\n"},
                {" - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " -\n"},
                {" * ", " - ", " - ", " - ", " - ", " * ", " * ", " * ", " - ", " -\n"},
                {" - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " -\n"},
                {" - ", " - ", " - ", " - ", " - ", " * ", " - ", " - ", " - ", " -\n"},
                {" - ", " - ", " - ", " - ", " - ", " - ", " - ", " * ", " - ", " -\n"},
                {" * ", " * ", " * ", " * ", " - ", " - ", " - ", " * ", " - ", " *"}
        };

        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(args[i]);
        }
        for (String[] aTomb : tomb) { //aTomb = A tomb változóinak sora
            for (String anATomb : aTomb) { //anATomb = Az atomb n-dik eleme
                System.out.print(anATomb);
            }
        }
    }
}
