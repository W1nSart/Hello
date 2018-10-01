package practice;

import java.util.Random;

public class PasswordGenerator {
    static Random rd = new Random();
    static String validDigits = "1234567890";
    static String validSpecChar = "!@#$%%^&*";
    static String validChar = "ABCDabcd";
    static final int digitsGroup = 0;
    static final int specCharGroup = 1;
    static final int charGroup = 2;


    public static char generatedRandomChar(String array){
        int randomIndex = rd.nextInt(array.length());
        return array.charAt(randomIndex);
    }


    public static String generatePassword( int size ){
        boolean specCharFlag = false;
        int digitsCounter = 0;
        StringBuilder pass = new StringBuilder();
        char randomChar = '0';
        while (size != pass.length()){
            int randomGroup= rd.nextInt(3);
            switch (randomGroup){
                case digitsGroup:
                    if (digitsCounter <= 3){
                        randomChar = generatedRandomChar(validDigits);
                    digitsCounter ++;
                    }
                    break;
                case specCharGroup:
                    if (!specCharFlag)
                        randomChar =  generatedRandomChar(validSpecChar);
                    specCharFlag = true;
                    break;
                case charGroup:
                    randomChar = generatedRandomChar(validChar);
                    break;
            }
            if ((pass.length() == 0) || (pass.charAt(pass.length() - 1 )!= randomChar)){
                pass.append(randomChar);
            }


        }
        return pass.toString();


    }

    public static void main(String[] args) {
        System.out.println(generatePassword(20));
    }
}
