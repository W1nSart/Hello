package HomeWork4;

public class Rectangle {
    int hight;
    int side;

     public Rectangle(int hight, int side) {
         this.hight = hight;
         this.side = side;
    }
    protected int getPerim() {
        int Perim = 2*(hight + side);
        return Perim;
    }
    protected int getSq(){
        int Side = hight * side;
        return  Side;
    }



}
