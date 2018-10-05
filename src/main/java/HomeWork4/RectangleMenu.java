package HomeWork4;

import java.util.Scanner;

public class RectangleMenu {
    protected static void getRectangleCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы выбрали прямоугольник");
        System.out.print("Введите высоту: ");
        int hi = scan.nextInt();
        System.out.print("Введите длину стороны: ");
        int si = scan.nextInt();
        Rectangle r = new Rectangle(hi,si);
        System.out.println("Периметр прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равен " + r.getPerim());
        System.out.println("Площадь прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равна " + r.getSq());

    }
}
