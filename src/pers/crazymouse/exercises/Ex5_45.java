package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double x[] = new double[10];
        double sum = 0, sumSquare = 0;
        for (int i = 0; i < 10; i++) {
            x[i] = input.nextDouble();
            sum += x[i];
            sumSquare += x[i] * x[i];
        }
        double mean = sum / 10;
        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f", Math.pow((sumSquare - sum * sum / 10) / 9, 0.5));
    }
}
