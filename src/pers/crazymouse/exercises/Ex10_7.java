package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Account;

import java.util.Scanner;


public class Ex10_7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        Account accountList[] = new Account[10];
        for (int i = 0; i < 10; i++) {
            accountList[i] = new Account(i, 100);
        }
        while (true) {
            System.out.print("Enter and id: ");
            int id = input.nextInt();
            if (id < 0 || id > 9)
                continue;
            while (true) {
                boolean isExit = false;
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.printf("The balance is %.2f\n4", accountList[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        if (!accountList[id].withDraw(input.nextDouble())) {
                            System.out.println("Lack of balance!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accountList[id].deposit(input.nextDouble());
                        break;
                    case 4:
                        isExit = true;
                        break;
                    default:
                        System.out.println("Wrong choice!");
                        continue;
                }
                if (isExit)
                    break;
            }
        }
    }
}
