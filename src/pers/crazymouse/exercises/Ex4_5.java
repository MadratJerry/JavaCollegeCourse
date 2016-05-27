package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        System.out.println("The area of the polygon is " + n * s * s / (4 * Math.tan(Math.toRadians(180 / n))));
    }
}
