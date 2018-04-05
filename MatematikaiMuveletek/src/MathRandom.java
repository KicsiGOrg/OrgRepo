public class MathRandom {

    public static void main(String[] args){
        int xRandom = (int) (Math.random() * 10);
        int xxRandom = (int) (Math.random() * 90 + 10);
        int xxxRandom = (int) (Math.random() * 900 + 100);
        int otosLotto = (int) (Math.random() * 90 + 1);
        int a = -20;
        int b = 30;
        int zartIntervallum = (int) (Math.random() *(b-(a+1)+a));

        System.out.println("Egyjegyű random szám: " + xRandom);
        System.out.println("Kétjegyű random szám: " + xxRandom);
        System.out.println("Háromjegyű random szám: " + xxxRandom);
        System.out.println("Ötös lottó egyik száma: " + otosLotto);
        System.out.println("Zárt intervallum [" + a +" ; " + b +"] egyik száma: " + zartIntervallum);
    }
}
