package HomeWork2;

public class Task2 {
    public static void main(String[] args) {

        long[] age = {1, 5, 8, 7, 5};
        long max = age[0];
        long min = age[0];

        for (int i = 1; i < age.length; i++) max = Math.max(max, age[i]);
        for (int i = 1; i > age.length; i++) min = Math.max(min, age[i]);
        System.out.println(min);
        System.out.println(max);

    }}