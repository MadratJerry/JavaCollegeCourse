package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex8_1 {
    public static void main(String[] args) {
        double matrix[][] = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();
        for (int i = 0; i < matrix[0].length; i++)
            System.out.printf("Sum of the elements at column %d is %.1f\n", i, sumColum(matrix, i));
    }

    public static double sumColum(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][columnIndex];
        return sum;
    }
}
