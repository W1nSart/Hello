
import java.util.Scanner;


public class secondLesson {

    public static void calculateCost (double candyCost_, double cookieCost_) {
        double x = candyCost_ * 0.3;
        double y = cookieCost_ * 0.4;
        double z = ((candyCost_ * 2) + (cookieCost_ * 1.8)) * 3;
        System.out.printf("  Сумма одной покупки конфет -%f%n  Сумма одной покупки печенья - %f%n  Cумма трех покупок - %f%n",x,y,z);

    }



    public static void main(String[] args) {
        calculateCost(2345,2342);
        Scanner console = new Scanner(System.in);
        System.out.println("Input candy cost - ");
        double candyCost = console.nextFloat();
        System.out.println("Input cookie cost - ");
        double cookieCost = console.nextFloat();
        calculateCost(candyCost,cookieCost );
        }
    }




