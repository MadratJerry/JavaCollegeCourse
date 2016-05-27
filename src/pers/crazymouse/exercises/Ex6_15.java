package pers.crazymouse.exercises;

public class Ex6_15 {
    public static void main(String[] args) {
        System.out.printf("%-16s%-16s%-16s%-16s%-16s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-16s%-16s%-16s%-16s%-16s\n", "Income", "Single", "Married Joint", "Separate", "a House");
        for (int i = 0; i < 71; i++)
            System.out.print('-');
        System.out.println();
        for (double i = 50000; i <= 60000; i += 50, System.out.println()) {
            System.out.printf("%-16d", (int) i);
            for (int j = 0; j < 4; j++)
                System.out.printf("%-16d", Math.round(computeTax(j, i)));
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double income = taxableIncome;

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
        return tax;
    }

    public static void MakeComputeTaxArr(int[] ori, int[] goal) {
        goal[0] = ori[0];
        for (int i = 1; i < 5; i++) {
            goal[i] = ori[i];
            goal[i] -= ori[i - 1];
        }
    }
}
