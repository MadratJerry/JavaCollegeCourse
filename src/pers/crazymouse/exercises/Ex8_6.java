package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex8_6 {
    private static Scanner input;

    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double m1[][] = getMatrix(3, 3);
        System.out.print("Enter matrix2: ");
        double m2[][] = getMatrix(3, 3);
        double res[][] = multiplyMatrix(m1, m2);
        for (int i = 0; i < 3; i++)
            System.out.println(java.util.Arrays.toString(res[i]));
        System.out.println("I don't want to print!");
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double c[][] = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        return c;
    }

    public static double[][] getMatrix(int x, int y) {
        input = new Scanner(System.in);
        double back[][] = new double[x][y];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                back[i][j] = input.nextDouble();
        return back;
    }
}
