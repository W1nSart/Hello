package HomeWork4;

public class Rectangle {
    int hight;
    int side;

     Rectangle(int hight, int side) {

    }


    public static int getPerim(int hight, int side) {
        int Perim = 2*(hight + side);
        return Perim;


    }
    public static int getSq(int side, int hight){
        int Side = hight * side;
        return  Side;

    }



}
