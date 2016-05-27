package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_13 {
    public static void main(String[] args) {
        System.out.print("Enter the monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        double saving = 0.0;
        for (int i = 1; i <= 6; i++) {
            saving += amount;
            saving *= (1 + 0.00417);
        }
        System.out.printf("After the sixth month, the account value is $%.2f", saving);
    }
}
