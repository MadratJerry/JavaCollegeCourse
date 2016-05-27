package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Loan;

import java.util.Scanner;

public class Ex5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int year = input.nextInt();
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double rate = 0.05; rate <= 0.08; rate += 0.00125) {
            double monthlyPayment = new Loan(amount, rate / 12, year * 12).getMonthlyPayment();
            System.out.printf("%-20s%-20.2f%-20.2f", String.format("%.3f%%", rate * 100), monthlyPayment,
                    monthlyPayment * year * 12);
            System.out.println();
        }
    }
}
