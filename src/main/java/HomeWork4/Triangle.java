package HomeWork4;

public class Triangle{
    int side1;
    int side2;
    final static double corner = 45;

    Triangle(int s1, int s2) {
        side1 = s1;
        side2 = s2;

    }


    public static int getPerim(int s1, int s2 ) {
        int Perim = s1 + s1 + s2;
        return Perim;


    }
    public static int getSq(int s1, int s2){
        int Sq = (int) (0.5 * s1 * s2 * Math.asin(corner));
        return  Sq;

    }
}
