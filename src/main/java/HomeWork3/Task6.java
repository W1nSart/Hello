package HomeWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    private static String name = " ";
    private static String phoneNumber = " ";
    private static String email = " ";

    private static String getName(){
        System.out.println("Введите ФИО");
        Scanner console = new Scanner(System.in);
        return name = console.nextLine();
    }
    private static String getPhoneNumber(){
        System.out.println("Введите мобильный телефона");
        Scanner console = new Scanner(System.in);
        return phoneNumber = console.nextLine();
    }
    private static String getEmail(){
        System.out.println("Введите email");
        Scanner console = new Scanner(System.in);
        return email = console.nextLine();
}
    private static boolean checkName(String name){
        Pattern p = Pattern.compile("^[a-zA-Z- ]+$");
        Matcher m = p.matcher(name);
        if (m.matches() == true) {
            return m.matches();
        } else System.out.println("ФИО введено неверно! Допустимы только буквы английского алфавита, дефис и пробел");

        return false;
    }

    private static boolean checkPhoneNumber(String phoneNumber){
        Pattern p = Pattern.compile("^(((\\+)?(380))|(0))([0-9]{9})$");
        Matcher m = p.matcher(phoneNumber);
        if (m.matches() == true) {
            return m.matches();
        } else System.out.println("Номер телефона введен неверно! Допустимы +380 далее 2 цифры кода (украина) и 7 любых цифр");

        return false;
    }
    private static boolean checkEmail(String email) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}");
        Matcher m = p.matcher(email);
        if (m.matches() == true) {
            return m.matches();
        } else
            System.out.println("Почта указана неверно! Допустимы любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @");

        return false;
    }


    public static void main(String[] args) {
        getName();
        getPhoneNumber();
        getEmail();
        if (checkName(name) == true & checkPhoneNumber(phoneNumber) == true & checkEmail(email) == true){
            System.out.println("Успех!");
        }else System.out.println("\nНеудача((");
    }
}
