package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 < num2) {
            double t = num1;
            num1 = num2;
            num2 = t;
        }
        if (num3 >= num1)
            System.out.printf("%f %f %f", num2, num1, num3);
        else if (num3 <= num2)
            System.out.printf("%f %f %f", num3, num2, num1);
        else
            System.out.printf("%f %f %f", num2, num3, num1);
    }
}
