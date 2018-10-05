package HomeWork4;

public class Square {
    int sideLenght;

    Square(int sideLenght) {

    }


    public static int getPerim(int sideLenght) {
        int Perim = sideLenght * 4;
        return Perim;
    }

    public static int getSq(int sideLenght) {
        int Sq = sideLenght * sideLenght;
        return Sq;
    }
}
