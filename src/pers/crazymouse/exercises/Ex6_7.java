package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter the rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;
        // System.out.print("Enter the year: ");
        // int years = input.nextInt();
        System.out.printf("%-12s%-12s\n", "Years", "Future Value");
        for (int i = 1; i <= 30; i++)
            System.out.printf("%-12d%-12.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
