package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Tax;

/**
 * Created by crazymouse on 5/25/16.
 */
public class Ex10_8 {
    public static void main(String[] args) {
        double[] rates_2009 = new double[]{0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets_2009 = new int[][]{
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
        double[] rates_2001 = new double[]{15, 27.5, 30.5, 35.5, 39.1};
        int[][] brackets_2001 = new int[][]{
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36230, 93650, 151650, 297350}};
        headLine();
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50, System.out.println()) {
            System.out.printf("%-16d", taxableIncome);
            for (int filingStatus = 0; filingStatus < 4; filingStatus++) {
                Tax tax = new Tax(filingStatus, brackets_2001, rates_2001, taxableIncome);
                System.out.printf("%-16d", Math.round(tax.getTax()));
            }
        }
        System.out.println();
        headLine();
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50, System.out.println()) {
            System.out.printf("%-16d", taxableIncome);
            for (int filingStatus = 0; filingStatus < 4; filingStatus++) {
                Tax tax = new Tax(filingStatus, brackets_2009, rates_2009, taxableIncome);
                System.out.printf("%-16d", Math.round(tax.getTax()));
            }
        }
    }

    public static void headLine() {
        System.out.printf("%-16s%-16s%-16s%-16s%-16s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-16s%-16s%-16s%-16s%-16s\n", "Income", "Single", "Married Joint", "Separate", "a House");
        for (int i = 0; i < 71; i++)
            System.out.print('-');
        System.out.println();
    }
}
