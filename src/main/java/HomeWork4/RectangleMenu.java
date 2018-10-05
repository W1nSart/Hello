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
        int a = Rectangle.getPerim(hi, si);
        int b = Rectangle.getSq(si, hi);
        System.out.println("Периметр прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равен " + a);
        System.out.println("Площадь прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равна " + b);

    }
}
