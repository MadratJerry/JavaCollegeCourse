package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_14 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Input
        double pounds = PrintAndGetDouble("Enter weight in pounds:");
        double inches = PrintAndGetDouble("Enter inches: ");

        // Compute
        double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
        double heightInMeters = inches * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display
        System.out.printf("BMI is %.4f", bmi);
    }

    public static double PrintAndGetDouble(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
