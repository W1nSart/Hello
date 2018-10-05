package HomeWork4;

public class Circle {
    int radius;
    static final double Pi = 3.1415926536;

    Circle(int radius) {


    }

    public static int getPerim(int radius) {
        int CirclePerim = (int) (2 * Pi * radius);
        return CirclePerim;

    }

    public static int getSq(int radius) {
        int CircleSq = (int) (Pi * Math.pow(radius, 2));
        return CircleSq;

    }
}
