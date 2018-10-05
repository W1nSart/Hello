package HomeWork4;

public class Triangle {
    int side1;
    int side2;
    final static double corner = 45;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    protected  int getPerim() {
        int Perim = side1 + side1 + side2;
        return Perim;
    }
    protected  int getSq() {
        int Sq = (int) (0.5 * side1 * side2 * Math.asin(corner));
        return Sq;
    }
}
