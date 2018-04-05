public class PrimNumber {

    public static void main(String[] args){

        for(int num = 2; num <= 200; num++){
            if(num < 3) {
                System.out.println("if ág: " + num );
            }
            else if (num%2  != 0){
                System.out.println("else ág: " + num);
            }
        }
    }
}



/*
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139,
149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
*/