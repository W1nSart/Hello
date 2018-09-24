package org.home;

import java.util.Scanner;

public class Velocity {

    public static void Speed(float time, float range) {
        float rangeTo = range / 1000;
        float timeTo = time * 60;
        float speed = rangeTo / timeTo;
        System.out.printf("Скорость в м/с = %f %%f %f %n", speed);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время в минут = ");
        float time = console.nextFloat();
        System.out.println("Введите расстояние = ");
        float range = console.nextFloat();
        Speed(time , range);
    }
}
