package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double matrix[][] = new double[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextDouble();
        System.out.printf("Sum of the elements in the major diagonal is %.1f", sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (i == j)
                    sum += m[i][j];
        return sum;
    }
}
