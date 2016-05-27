package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        System.out.print("Enter a, b, c: ");
        double a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double delta = Math.pow(b * b - 4 * a * c, 0.5);
        double r1 = (delta - b) / 2 * a;
        double r2 = (-delta - b) / 2 * a;
        if (delta == 0.0)
            System.out.printf("The equation has one roots %f", r1);
        else if (delta > 0.0)
            System.out.printf("The equation has two roots %f and %f", r1, r2);
        else
            System.out.printf("The equation has no real roots");
    }
}
