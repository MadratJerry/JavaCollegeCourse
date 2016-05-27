package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_18 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        double num[] = new double[10];
        for (int i = 0; i < 10; i++)
            num[i] = input.nextDouble();
        bubbleSort(num);
        System.out.println(java.util.Arrays.toString(num));
    }

    public static void bubbleSort(double[] x) {
        for (int i = 0; i < x.length; i++)
            for (int j = i + 1; j < x.length; j++)
                if (x[i] > x[j]) {
                    double t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
    }
}
