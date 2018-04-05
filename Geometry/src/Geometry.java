public class Geometry {

    public static void main(String[] args) {

        String star = "*";
        String breakLine = "\n--------------------------------------------------------------------------------\n";

        // Négyzet kirajzolása
        int squareWidth = 40;
        String stars = new String(new char[squareWidth]).replace("\0", star);
        for (int i = 1; i <= 20; i++) {
            System.out.println(stars);
        }
        System.out.println(breakLine);

        // Téglalap
        int rectangleWidth = 80;
        String lines = new String(new char[rectangleWidth]).replace("\0", star);
        for (int i = 1; i <= 20; i++) {
            System.out.println(lines);
        }
        System.out.print(breakLine);

        // Rombusz
        int rombusWidth = 1, rombusSkew = 20;
        for (int i = rombusSkew; i >= 0; i--) {
            String rombusStars = new String(new char[rombusWidth]).replace("\0", star);
            String repeated = new String(new byte[i]).replace("\0", " ");
            System.out.println(repeated + rombusStars);
            rombusWidth += 2;
        }
        int rombusWidthDown = 39, rombusSkewDown = 1;
        for (int i = rombusSkewDown; i <= 20; i++) {
            String rombusStarsDown = new String(new char[rombusWidthDown]).replace("\0", star);
            String repeated = new String(new byte[i]).replace("\0", " ");
            System.out.println(repeated + rombusStarsDown);
            rombusWidthDown -= 2;
        }
        System.out.println(breakLine);

        // Paralelogramma
        int paralelogrammaWidth = 40, skew = 20;
        String paralelogrammaStars = new String(new char[paralelogrammaWidth]).replace("\0", star);
        for (int i = skew; i >= 0; i--) {
            String repeated = new String(new byte[i]).replace("\0", " ");
            System.out.println(repeated + paralelogrammaStars);
        }
        System.out.println(breakLine);

        // Trapéz
        int trapezeWidth = 40, trapezeSkew = 20;
        for (int i = trapezeSkew; i >= 0; i--) {
            String trapezeStars = new String(new char[trapezeWidth]).replace("\0", star);
            String repeated = new String(new byte[i]).replace("\0", " ");
            System.out.println(repeated + trapezeStars);
            trapezeWidth += 2;
        }
        System.out.println(breakLine);

        // Háromszög (Nem volt specifikálva, hogy hogyan nézzen ki a háromszög)
        int triangleWidth = 1, triangleSkew = 20;
        for (int i = triangleSkew; i >= 0; i--) {
            String trinagleStars = new String(new char[triangleWidth]).replace("\0", star);
            String repeated = new String(new byte[i]).replace("\0", " ");
            System.out.println(repeated + trinagleStars);
            triangleWidth += 2;
        }
    }
}

