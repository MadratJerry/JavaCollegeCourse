package pers.crazymouse.exercises.myclass;

import java.util.Scanner;

public class Employee {
    private String name;
    private int workHourPerWeek;
    private double hourlyPay;
    private double federalTax;
    private double stateTax;

    private int hours;

    public Employee() {

    }

    public Employee(String name, int[] hours) {
        this.hours = 0;
        this.name = name;
        for (int i = 0; i < hours.length; i++)
            this.hours += hours[i];
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        workHourPerWeek = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTax = input.nextDouble();

    }

    public void printInformation() {
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + workHourPerWeek);
        System.out.println("Pay Rate: $" + hourlyPay);
        double money = workHourPerWeek * hourlyPay;
        System.out.println("Gross Pay: $" + money);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTax * 100, money * federalTax);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTax * 100, money * stateTax);
        System.out.printf("  Total Deduction: $%.2f\n", money * (federalTax + stateTax));
        System.out.printf("Net Pay: $%.2f\n", money * (1 - federalTax - stateTax));
    }
}
