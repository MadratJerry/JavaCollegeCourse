package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yiedld: ");
        double rate = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();
        System.out.printf("%-16s%-16s\n", "Month", "CD Value");
        for (int i = 1; i <= month; i++) {
            amount *= (1 + rate / 1200);
            System.out.printf("%-16d%-16.2f\n", i, amount);
        }
    }
}
