package HomeWork2;

import java.util.Scanner;

public class Task1 {

    public static String st1 = "Курсы:Java core";
    public static String st2 = "Студент";
    public static String st3 = "";
    public static int maxLenght = 0;
    public static String space = " ";




    public static void studentName() {
        System.out.println("Введите ФИО студента ");
        st3 = new Scanner(System.in).nextLine();
    }
    public static void getMaxLenght(){
        maxLenght = (st3.length() > st1.length()) ? st3.length() : st1.length();
        maxLenght = maxLenght + 4;


    }
    public static String getStar() {
        String stars = "";
        for (int i = 0; i < maxLenght; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getString(String str) {
        String spaceB = "";
        String spaceA = "";
        int countAfter = 0;
        int counterBefore = (maxLenght - str.length()) / 2;
        String finalStr = "";
        if (maxLenght - str.length() % 2 > 0){
            countAfter = counterBefore + 1;
        }
            else {
            countAfter = counterBefore;
        }
        for (int i = 1; i < counterBefore; i++){
            spaceB = spaceB + space;
        }
        for (int i = 1; i < countAfter; i++ ){
            spaceA = spaceA + space;
        }
        String before = "*" + spaceB;
        String after = spaceA + "*";
        finalStr = before + str + after;
        return finalStr;
    }

    public static void main(String[] args) {
        studentName();
        getMaxLenght();
        String star = getStar();
        System.out.printf("%s%n%s%n%s%n%s%n%s%n",star, getString(st1),getString(st2), getString(st3), star);



    }
}










