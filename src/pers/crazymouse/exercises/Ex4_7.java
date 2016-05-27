package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        final double PI = 3.1415926535;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        for (int i = 0; i < 5; i++) {
            System.out.printf("(%f, %f)\n", radius * Math.cos(2 * PI / 5 * i), radius * Math.sin(2 * PI / 5 * i));
        }
    }
}
