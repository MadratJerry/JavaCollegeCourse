package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Transaction;

import java.util.ArrayList;

/**
 * Created by crazymouse on 5/23/16.
 */
public class Ex11_8 {
    public static void main(String[] args) {
        Account account1 = new Account("Georagge", 1122, 1000);
        account1.setAnnualInterestRate(1.5);
        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);
        account1.withDraw(5);
        account1.withDraw(4);
        account1.withDraw(2);
        account1.printBill();
    }
}

class Account extends pers.crazymouse.exercises.myclass.Account {
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    @Override
    public boolean withDraw(double x) {
        if (super.withDraw(x)) {
            transactions.add(new Transaction('W', x, getBalance() - x, "You lost money"));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deposit(double x) {
        transactions.add(new Transaction('D', x, getBalance() + x, "You get the money"));
    }

    public void printBill() {
        System.out.printf("Name: %s Rate: %.2f%% Balance: %.2f\n", name, getAnnualInterestRate(), getBalance());
        if (transactions.isEmpty()) {
            System.out.println("No transaction.");
        } else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i).toString());
            }
        }
    }
}