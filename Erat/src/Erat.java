public class Erat {

    public static void main(String[] args) {

        boolean[] tomb = new boolean[2_000_000];
        int p;

       for(int i = 2; i < tomb.length; i++){
           if(!tomb[i]){
               System.out.println(i);
               for(p = 2;p * i < tomb.length; p++){
                   tomb[p * i] = true;
               }
           }
       }
    }
}
