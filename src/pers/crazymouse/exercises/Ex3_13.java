package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or "
                + "ualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income:");
        double income = input.nextDouble();

        double tax = 0;

        double taxRate[] = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
        int singleTaxArr[] = {8350, 33950, 82250, 171550, 372950};
        int marriedJointlyTaxArr[] = {16700, 67900, 137050, 208850, 372950};
        int marriedSeparatelyTaxArr[] = {8350, 33950, 68525, 104425, 186475};
        int headOfTaxArr[] = {11950, 45500, 117450, 190200, 372950};
        int computeTaxArr[] = new int[5];
        switch (status) {
            case 0:
                MakeComputeTaxArr(singleTaxArr, computeTaxArr);
                break;
            case 1:
                MakeComputeTaxArr(marriedJointlyTaxArr, computeTaxArr);
                break;
            case 2:
                MakeComputeTaxArr(marriedSeparatelyTaxArr, computeTaxArr);
                break;
            case 3:
                MakeComputeTaxArr(headOfTaxArr, computeTaxArr);
                break;
        }
        for (int num = 0; ; num++) {
            if (num == 5 || income <= (double) computeTaxArr[num]) {
                tax += income * taxRate[num];
                break;
            } else {
                tax += computeTaxArr[num] * taxRate[num];
                income -= computeTaxArr[num];
            }
        }
        System.out.printf("Tax is %.1f", tax);
    }

    public static void MakeComputeTaxArr(int[] ori, int[] goal) {
        goal[0] = ori[0];
        for (int i = 1; i < 5; i++) {
            goal[i] = ori[i];
            goal[i] -= ori[i - 1];
        }
    }
}
