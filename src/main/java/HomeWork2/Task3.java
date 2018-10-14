package HomeWork2;
//Fibonachi

import java.util.Scanner;

public class Task3 {
        public static int f(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return f(n - 1) + f(n - 2);
            }
        }

        public static void main (String[] args) {
            System.out.println("Введите желаем индекс");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int fn = f(n);
            System.out.println(fn);
        }
    }