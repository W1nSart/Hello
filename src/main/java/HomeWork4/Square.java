package HomeWork4;

public class Square {
    int sideLenght;

    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }
    protected  int getPerim() {
        int Perim = sideLenght * 4;
        return Perim;
    }

    protected int getSq() {
        int Sq = sideLenght * sideLenght;
        return Sq;
    }
}
