package pers.crazymouse.exercises.myclass;

import java.util.Date;

/**
 * Created by crazymouse on 5/25/16.
 */
public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String toString() {
        return String.format("%s Type: %c Amount: %.2f Balance: %.2f Description: %s\n",
                date.toString(), type, amount, balance, description);
    }
}
