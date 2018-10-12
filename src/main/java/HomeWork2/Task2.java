package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static long number = 15875;
    public static long min = 9;
    public static long max = 0;



    public static void getMinMax() {
        while (number > 0) {
            long current = number % 10;
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
            number = number / 10;
        }
    }

    public static void main(String[] args) {
        getMinMax();
        System.out.printf("Минимальное значение : %s%nМаксимальное значение : %s%n", min, max);


    }
}


