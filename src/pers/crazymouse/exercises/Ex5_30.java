package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        double res = 0;
        for (int i = 1; i <= month; i++) {
            res += amount;
            res *= (1 + rate / 1200);
        }
        System.out.printf("%.3f", res);
    }
}
