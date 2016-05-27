package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        System.out.printf("The interest is %.5f", balance * (rate / 1200));
    }
}
