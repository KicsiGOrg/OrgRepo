public class WomensDay {

    public static void main(String[] args) {
        String message = "\n           Boldog Nőnapot kívánok " + "\u2764" + " !\n" ;
        System.out.println(message);
        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(args[i]);
        }
    }
}
