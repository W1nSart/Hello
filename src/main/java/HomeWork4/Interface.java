package HomeWork4;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "Выберите фигуру:\n" +
                "1. Квадрат\n" +
                "2. Прямоугольник\n" +
                "3. Круг\n" +
                "4. Треугольник\n" +
                "5. Выход\n";
        System.out.println(menu);
        boolean isQuit = false;
        while (!isQuit) {
            byte functuion = scan.nextByte();

            switch (functuion) {

                case 1:
                    SquareMenu.getSquareCount();
                    break;
                case 2:
                    RectangleMenu.getRectangleCount();
                    break;
                case 3:
                    CircleMenu.getCircleCount();
                    break;
                case 4:
                    TriangleMenu.getTriangleCount();
                    break;
                case 5:
                    isQuit = true;
                    break;

            }

        }
    }
}


