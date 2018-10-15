package HomeWork3;

import java.util.Scanner;


public class Task4 {
    public static String s = "";


    public static void getCustomString() {
        System.out.println("Введите желаемую строку");
        Scanner customString = new Scanner(System.in);
        s = customString.nextLine();
    }

    public static String getUpperCase() {
        String upperCase = s.toUpperCase();
        return upperCase;


    }

    public static String getLowerCase() {
        String lowerCase = s.toLowerCase();
        return lowerCase;
    }

    public static String getFirstUpper() {
        char[] c = s.toCharArray();
        if (Character.isAlphabetic(c[0])) c[0] = Character.toUpperCase(c[0]);
        String res = "" + c[0];
        for (int i = 1; i < c.length; i++) {
            if (Character.isAlphabetic(c[i]) && !Character.isAlphabetic(c[i - 1])) c[i] = Character.toUpperCase(c[i]);
            res += c[i];
        }
        return res;

    }

    public static String getFirstLower() {
        char[] d = s.toCharArray();
        if (Character.isAlphabetic(d[0])) d[0] = Character.toLowerCase(d[0]);
        String res1 = "" + d[0];
        for (int i = 1; i < d.length; i++) {
            if (Character.isAlphabetic(d[i]) && !Character.isAlphabetic(d[i - 1])) d[i] = Character.toLowerCase(d[i]);
            res1 += d[i];
        }
        return res1;
    }

    public static String getUpperSentence() {
        String z = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        return z.trim();

    }


    public static void choose() {
        Scanner scan = new Scanner(System.in);
        String face = "        А. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n" +
                "        B. строка в нижнем регистре\n" +
                "        C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке)\n" +
                "        D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n" +
                "        E. Как в предложении(с заглавной буквы).\n" +
                "        F. выход из программы;";
        System.out.println(face);

        String n = scan.nextLine();
        switch (n) {
            case "A":
                System.out.println(getUpperCase());
                break;
            case "B":
                System.out.println(getLowerCase());
                break;
            case "C":
                System.out.println(getFirstUpper());
                break;
            case "D":
                System.out.println(getFirstLower());
                break;
            case "E":
                System.out.println(getUpperSentence());
            case "F":
                choose();
                break;
        }
    }



    public static void main(String[] args) {
    getCustomString();
    choose();

    }
}




