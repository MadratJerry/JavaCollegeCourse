package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (MyTriangle.isValid(side1, side2, side3))
            System.out.println("The are is " + MyTriangle.area(side1, side2, side3));
        else
            System.out.println("Invalid input.");
    }
}

class MyTriangle {
    static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }

    static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}
