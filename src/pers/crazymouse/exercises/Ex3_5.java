package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        String weekArr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saterday"};
        int today = PrintAndGetInt("Enter today's day: ");
        int since = PrintAndGetInt("Enter the number of days elapsed ince today: ");
        System.out.printf("Today is %s and the future day is %s", weekArr[today], weekArr[(today + since) % 7]);
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
