package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int year = input.nextInt();
        System.out.printf("Accumulated value is $%.2f", investment * Math.pow(1 + rate / 12 / 100, year * 12));
    }
}
