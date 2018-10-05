package HomeWork4;

import java.util.Scanner;

public class CircleMenu {

    protected static void getCircleCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы выбрали круг");
        System.out.print("Введите радиус: ");
        int rad = scan.nextInt();
        Circle g = new Circle(rad);
        System.out.println("Периметр круга c радиусом - " + rad + " равен " + g.getPerim() );
        System.out.println("Площадь круга c радиусом - " + rad + " равна " + g.getSq());
    }
}
