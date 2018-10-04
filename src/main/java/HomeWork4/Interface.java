package HomeWork4;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "Выберите фигуру:\n" +
                "1. Квадрат\n" +
                "2. Прямоугольник\n" +
                "3. Круг\n" +
                "4. Треугольник\n" +
                "5. Выход";
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
                    System.out.println("Периметр квадрата cо стороной " + side + " равен " + Square.getPerim(side));
                    break;

                case 2:

                    scan = new Scanner(System.in);
                    System.out.println("Вы выбрали прямоугольник");
                    System.out.print("Введите высоту: ");
                    int hi = scan.nextInt();
                    System.out.print("Введите длину стороны: ");
                    int si = scan.nextInt();
                    System.out.println("Периметр прямоугольника c выстой " + hi + " и длиной стороны " + si +  " равен " + Rectangle.getPerim(hi,si));
                    System.out.println("Площадь прямоугольника c выстой " + hi + " и длиной стороны " + si +  " равна " + Rectangle.getSq(hi,si));

                    break;


//            case 3:
//                System.out.println("Number of elements: ");
//                // list.showNumberOfElements();
//                break;
//
//            case 4:
//                System.out.println("Enter value for search: ");
//                scan.nextLine();
//                value = scan.nextInt();
//                // list.showByValue(value);
//                break;
//

              case 5:
                isQuit = true;
                break;
//
//            default:
//                System.out.println("No such menu");
//                break;
            }

       //     System.out.println(menu);
        }

    }
}


