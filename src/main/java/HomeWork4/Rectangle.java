package HomeWork4;

public class Rectangle {
    int hight;
    int side;

     Rectangle(int h, int s) {
         hight = h;
         side = s;

    }


    public static int getPerim(int h, int s ) {
        int Perim = h + s + h + s;
        return Perim;


    }
    public static int getSq(int s, int h){
        int Side = h * s;
        return  Side;

    }



}
