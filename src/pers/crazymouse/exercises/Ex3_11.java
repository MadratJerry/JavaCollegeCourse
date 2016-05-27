package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_11 {
    public static void main(String[] args) {
        String monthArr[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "Novomber", "December"};
        int daysArr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = PrintAndGetInt("Enter the month: ");
        int year = PrintAndGetInt("Enter the year: ");
        int days = daysArr[month];
        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2)
            days++;
        System.out.printf("%s %d has %d days", monthArr[month - 1], year, days);
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
