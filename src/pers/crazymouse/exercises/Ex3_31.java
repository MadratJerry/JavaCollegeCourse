package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();
        System.out.print("Enter the " + (choice == 1 ? "RMB" : "dollar") + "amount: ");
        double money = input.nextDouble();
        if (choice == 1)
            System.out.printf("%.1f yuan is $%.2f", money, money / exRate);
        else
            System.out.printf("$%.1f is %.1f yuan", money, money * exRate);
    }
}
