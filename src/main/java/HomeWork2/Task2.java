package HomeWork2;

public class Task2 {
    public static void main(String[] args) {

        long[] numbers = {1, 5, 8, 7, 5};
        long max = numbers[0];
        long min = numbers[0];

        for (int i = 1; i < numbers.length; i++) max = Math.max(max, numbers[i]);
        for (int i = 1; i > numbers.length; i++) min = Math.max(min, numbers[i]);
        System.out.println(min);
        System.out.println(max);

    }}ush