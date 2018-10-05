package HomeWork4;

public class Rectangle {
    int hight;
    int side;

     Rectangle(int hight, int side) {

    }


    protected static int getPerim(int hight, int side) {
        int Perim = 2*(hight + side);
        return Perim;


    }
    protected static int getSq(int side, int hight){
        int Side = hight * side;
        return  Side;

    }



}
