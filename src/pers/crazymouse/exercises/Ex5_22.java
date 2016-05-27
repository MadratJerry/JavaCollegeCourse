package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Loan;

import java.util.Scanner;

public class Ex5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();
        Loan pay = new Loan(amount, rate / 1200, year * 12);
        System.out.printf("Monthly Payment: %.2f\n", pay.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f\n", pay.getTotalPayment());
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Payment#", "Interest", "Principal", "Balance");
        for (int i = 1; i <= year * 12; i++) {
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", i, pay.getInterest(i), pay.getPrincipal(i),
                    pay.getBalance(i));
        }
    }
}
