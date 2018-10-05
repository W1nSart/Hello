package HomeWork4;

public class Triangle {
    int side1;
    int side2;
    final static double corner = 45;

    Triangle(int side1, int side2) {


    }


    public static int getPerim(int side1, int side2) {
        int Perim = side1 + side1 + side2;
        return Perim;


    }

    public static int getSq(int side1, int side2) {
        int Sq = (int) (0.5 * side1 * side2 * Math.asin(corner));
        return Sq;

    }
}
