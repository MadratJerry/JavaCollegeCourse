package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.LinearEquation;

public class Ex3_3 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // double xArr[] = new double[6];
        // for (int i = 0; i < 6; i++)
        // xArr[i] = input.nextDouble();
        // double deno = xArr[0] * xArr[3] - xArr[1] * xArr[2];
        // if (deno == 0.0)
        // System.out.println("The equation has no solution");
        // else {
        // System.out.printf("x is %.2f and y is %.2f", (xArr[4] * xArr[3] -
        // xArr[1] * xArr[5]) / deno,
        // (xArr[0] * xArr[5] - xArr[4] * xArr[2]) / deno);
        // }

        LinearEquation line = new LinearEquation();
        LinearEquation.input(line);
        LinearEquation.printResult(line);
    }
}
