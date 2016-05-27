package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex9_13 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns in the array: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] a = new double[row][column];
        System.out.print("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.print("The location of the largest element is " + locateLargest(a).toString());
    }

    public static Location locateLargest(double[][] a) {
        Location res = new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > res.maxValue) {
                    res.maxValue = a[i][j];
                    res.row = i;
                    res.column = j;
                }
            }
        }
        return res;
    }
}

class Location {
    public int row, column;
    public double maxValue;

    public Location() {
        this(0, 0, -Double.MAX_VALUE);
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public String toString() {
        return String.format("%f at (%d, %d)", maxValue, row, column);
    }
}