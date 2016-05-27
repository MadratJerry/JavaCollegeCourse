package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String monthArr[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int daysArr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter a year: ");
        String str = input.nextLine();
        int year = Integer.parseInt(str);
        int month = 1;
        System.out.print("Enter a month: ");
        str = input.nextLine();
        for (int i = 0; i < 12; i++)
            if (str.equals(monthArr[i]))
                month = i + 1;
        int days = daysArr[month];
        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2)
            days++;
        System.out.printf("%s %d has %d days", monthArr[month - 1], year, days);
    }
}
