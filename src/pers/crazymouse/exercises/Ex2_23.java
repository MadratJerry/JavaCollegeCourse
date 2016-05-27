package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_23 {
    public static void main(String[] args) {
        double distance = PrintAndGetDouble("Enter the driving distance: ");
        double milesPerGallon = PrintAndGetDouble("Enter miles per gallon: ");
        double pricePerGallon = PrintAndGetDouble("Enter price per gallon: ");
        System.out.printf("The cost of driving is $%.2f", (distance / milesPerGallon) * pricePerGallon);
    }

    public static double PrintAndGetDouble(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
