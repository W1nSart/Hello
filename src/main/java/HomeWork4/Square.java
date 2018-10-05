package HomeWork4;

public class Square {
    int sideLenght;

    Square(int a){
        sideLenght = a;
    }



    public static int getPerim(int a){
        int Perim = a + a + a + a;
        return Perim;

    }
    public static int getSq(int a){
        int Sq = a * a;
        return Sq;
    }


    }
