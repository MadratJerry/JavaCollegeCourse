package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_30 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        int offset = PrintAndGetInt("Enter the time zone offset to GMT: ");
        System.out.printf("The current time is %02d:%2d:%02d %s", ((currentHour + offset + 24) % 24) % 12,
                currentMinute, currentSecond, ((currentHour + offset + 24) % 24) / 12 == 1 ? "PM" : "AM");
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
