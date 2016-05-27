package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_21 {
    public static void main(String[] args) {
        String weekArr[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thuresday", "Friday"};
        int year = PrintAndGetInt("Enter year: (e.g., 2012): ");
        int m = PrintAndGetInt("Enter month: 1-12: ");
        if (m < 3) {
            m += 12;
            year--;
        }
        int q = PrintAndGetInt("Enter the day of the month: 1-31: ");
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println("Day of the week is " + weekArr[h]);
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
