package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_7 {
    public static void main(String[] args) {
        long min = PrintAndGetLong("Enter the number of minutes: ");
        System.out.printf("%d minutes is approximately %d years and %d days", min, min / (60 * 24 * 365),
                (min % (60 * 24 * 365)) / (60 * 24));
    }

    public static long PrintAndGetLong(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextLong();
    }
}
