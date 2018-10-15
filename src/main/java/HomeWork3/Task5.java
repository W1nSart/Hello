package HomeWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static String customString = " ";

    public static void getCustomString() {
        Scanner console = new Scanner(System.in);
        customString = console.nextLine();

    }

    public static boolean checkCustomString() {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(customString);
        if (m.matches() == true) {
            return m.matches();
        } else System.out.println("Допустим ввод только латинских букв");

        return false;
    }

    public static void checkCountElements() {
        int[] arr = new int[255];
        for (int i = 0; i < customString.length(); i++) {
            arr[customString.charAt(i)]++;
        }
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " встречается " + arr[i] + " раз");
        }


    }

    public static void main(String[] args) {
        getCustomString();
        checkCustomString();
        checkCountElements();
    }

}
