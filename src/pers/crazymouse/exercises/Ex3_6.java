package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Input
        double pounds = PrintAndGetDouble("Enter weight in pounds:");
        double feet = PrintAndGetDouble("Enter feet: ");
        double inches = PrintAndGetDouble("Enter inches: ");

        // Compute
        double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underwight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }

    public static double PrintAndGetDouble(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
