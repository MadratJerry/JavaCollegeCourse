package pers.crazymouse.exercises.myclass;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(1, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setID(int x) {
        id = x;
    }

    public void setBalance(double x) {
        balance = x;
    }

    public void setAnnualInterestRate(double x) {
        annualInterestRate = x / 100;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public boolean withDraw(double x) {
        if (balance - x < 0) {
            return false;
        } else {
            balance -= x;
            return true;
        }
    }

    public void deposit(double x) {
        balance += x;
    }

    public String toString() {
        return String.format("Balance: %f MonthlyInterest: %.2f%% DateCreated: %s", balance,
                getMonthlyInterest() * 100, getDateCreated());
    }
}