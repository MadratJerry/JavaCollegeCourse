package pers.crazymouse.exercises.myclass;

import java.io.Serializable;

public class Loan implements Serializable {
    private double p;
    private double r;
    private int n;
    private double monthlyPayment;
    private double totalPayment;
    private double[] interest, principal, balance;

    public Loan(double p, double r, int n) {
        if (p <= 0 || r <= 0 || n <= 0)
            throw new IllegalArgumentException();
        this.p = p;
        this.r = r;
        this.n = n;
        compute();
    }

    private void compute() {
        monthlyPayment = p * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        totalPayment = monthlyPayment * n;
        interest = new double[n + 1];
        principal = new double[n + 1];
        balance = new double[n + 1];
        balance[0] = p;
        for (int i = 1; i <= n; i++) {
            interest[i] = balance[i - 1] * r;
            principal[i] = monthlyPayment - interest[i];
            balance[i] = balance[i - 1] - principal[i];
        }
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getBalance(int x) {
        return balance[x];
    }

    public double getInterest(int x) {
        return interest[x];
    }

    public double getPrincipal(int x) {
        return principal[x];
    }
}
