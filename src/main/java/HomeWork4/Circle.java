package HomeWork4;

public class Circle {
    int radius;
    static final double Pi = 3.1415926536;

    public Circle(int radius) {
        this.radius = radius;
    }
    protected int getPerim() {
        int CirclePerim = (int) (2 * Pi * radius);
        return CirclePerim;
    }
    protected int getSq() {
        int CircleSq = (int) (Pi * Math.pow(radius, 2));
        return CircleSq;

    }
}
