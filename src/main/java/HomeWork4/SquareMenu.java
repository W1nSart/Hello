package HomeWork4;

import java.util.Scanner;

public class SquareMenu {
    protected static void getSquareCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы выбрали квадрат");
        System.out.print("Введите длину стороны: ");
        int side = scan.nextInt();
        Square sq = new Square(side);
        System.out.println("Периметр квадрата cо стороной - " + side + " равен " + sq.getPerim());
        System.out.println("Площадь квадрата со стороной - " + side + " равна " + sq.getSq());
    }
}