package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Account;

public class Ex9_7 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withDraw(2500);
        account1.deposit(3000);
        System.out.println(account1.toString());
    }
}

