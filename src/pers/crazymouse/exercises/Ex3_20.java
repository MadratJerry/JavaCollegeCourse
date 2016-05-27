package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_20 {
    public static void main(String[] args) {
        double t = PrintAndGetDouble("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        if (t < -58 || t > 41)
            System.out.println("It's illegal.");
        double v = PrintAndGetDouble("Enter the wind spped (>=2) in miles per hour: ");
        if (v < 2)
            System.out.println("It's illegal.");
        double index = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
        System.out.printf("The wind chill index is %.5f", index);
    }

    public static double PrintAndGetDouble(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
