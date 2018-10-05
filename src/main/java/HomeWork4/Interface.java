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
                    scan = new Scanner(System.in);
                    System.out.println("Вы выбрали квадрат");
                    System.out.print("Введите длину стороны: ");
                    int side = scan.nextInt();
                    System.out.println("Периметр квадрата cо стороной - " + side + " равен " + Square.getPerim(side));
                    System.out.println("Площадь квадрата со стороной - " + side + " равна " + Square.getSq(side));
                    break;

                case 2:
                    scan = new Scanner(System.in);
                    System.out.println("Вы выбрали прямоугольник");
                    System.out.print("Введите высоту: ");
                    int hi = scan.nextInt();
                    System.out.print("Введите длину стороны: ");
                    int si = scan.nextInt();
                    System.out.println("Периметр прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равен " + Rectangle.getPerim(hi, si));
                    System.out.println("Площадь прямоугольника c выстой - " + hi + " и длиной стороны - " + si + " равна " + Rectangle.getSq(hi, si));
                    break;


                case 3:
                    scan = new Scanner(System.in);
                    System.out.println("Вы выбрали круг");
                    System.out.print("Введите радиус: ");
                    int rad = scan.nextInt();
                    System.out.println("Периметр круга c радиусом - " + rad + " равен " + Cyrcle.getPerim(rad));
                    System.out.println("Площадь круга c радиусом - " + rad + " равна " + Cyrcle.getSq(rad));

                    break;

                case 4:
                    scan = new Scanner(System.in);
                    System.out.println("Вы выбрали треугольник");
                    System.out.print("Введите длину стороны а: ");
                    int a = scan.nextInt();
                    System.out.print("Введите длину стороны b: ");
                    int b = scan.nextInt();
                    System.out.println("Периметр треугольника c длинной стороны a - " + a + " и длиной стороны b - " + b + " равен " + Triangle.getPerim(a, b));
                    System.out.println("Площадь треугольника c длинной стороны а - " + a + " и длиной стороны b - " + b + " равна " + Triangle.getSq(a, b));
                    break;



                case 5:
                    isQuit = true;
                    break;

            }

        }
    }}


