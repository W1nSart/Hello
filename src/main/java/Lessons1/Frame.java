package Lessons1;

import java.util.Scanner;

public class Frame {
    public static final String FIELD1 = "Курс: Java core";
    public static final String FIELD2 = "Студент";
    public static final char BORDER = '*';


    public static String getStudentName() {
        System.out.println("Введите имя студента ");
        Scanner console = new Scanner(System.in);
        String studentName = console.nextLine();
        return studentName;

    }

    public static int getMaxLenght(String name) {
        if (FIELD1.length() > name.length()) {
            return FIELD1.length();

        } else {
            return name.length();
        }

    }

    public static void drawLine(int size, char symbol) {
        for (int i = 0; i != size; i++) {
            System.out.print(symbol);
        }

    }
    public static void drawText(int maxSize, String text){
        System.out.print(BORDER + " ");
        int spaceLeft = (maxSize - text.length())/2;
        int spaceRight = maxSize - text.length() - spaceLeft;
        drawLine(spaceLeft,' ');
        System.out.print(text);
        drawLine(spaceRight,' ');
        System.out.print(" " + BORDER);
        System.out.println();


    }


    public static void main(String[] args) {
        String name = getStudentName();
        int maxLenght = getMaxLenght(name);
        drawLine(maxLenght + 4,BORDER);
        System.out.println();
        drawText(maxLenght,FIELD1);

        drawText(maxLenght,FIELD2);
        drawText(maxLenght,name);
        drawLine(maxLenght + 4,BORDER);


    }


}