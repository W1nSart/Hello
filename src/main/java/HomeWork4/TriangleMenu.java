package HomeWork4;

import java.util.Scanner;

public class TriangleMenu {
    protected static void getTriangleCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы выбрали треугольник");
        System.out.print("Введите длину стороны а: ");
        int a = scan.nextInt();
        System.out.print("Введите длину стороны b: ");
        int b = scan.nextInt();
        Triangle t = new Triangle(a,b);
        System.out.println("Периметр треугольника c длинной стороны a - " + a + " и длиной стороны b - " + b + " равен " + t.getPerim());
        System.out.println("Площадь треугольника c длинной стороны а - " + a + " и длиной стороны b - " + b + " равна " + t.getSq());

    }
}
