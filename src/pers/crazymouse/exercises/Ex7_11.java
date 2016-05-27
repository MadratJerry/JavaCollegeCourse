package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_11 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double num[] = new double[10];
        for (int i = 0; i < 10; i++)
            num[i] = input.nextDouble();
        System.out.printf("The mean is %.2f\n", mean(num));
        System.out.printf("The standard deviation is %.5f", deviation(num));
    }

    public static double mean(double[] x) {
        double res = 0;
        for (int i = 0; i < x.length; i++)
            res += x[i];
        return res / x.length;
    }

    public static double deviation(double[] x) {
        double res = 0;
        for (int i = 0; i < x.length; i++)
            res += Math.pow(x[i] - mean(x), 2);
        res /= x.length - 1;
        return Math.pow(res, 0.5);
    }
}
