package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tuition: ");
        double tuition = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        double tenYearTuition = tuition;
        for (int i = 0; i < 10; i++)
            tenYearTuition *= 1 + rate / 100;
        double money = 0;
        for (int i = 0; i < 4; i++)
            money += tenYearTuition * Math.pow(1 + rate / 100, i);
        System.out.println("After 10 years of tuition: " + tenYearTuition);
        System.out.println("Four year of tuition after 10 years: " + money);
    }
}
