package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_34 {
    public static void main(String[] args) {
        int numCom = 0, numPeo = 0;
        while (numCom < 2 && numPeo < 2) {
            String str[] = {"scissor", "rock", "paper"};
            int com = GetRandomNumber(2);
            int peo = PrintAndGetInt("scissor (0), rock (1), paper (2): ");
            System.out.print("The computer is " + str[com] + ". ");
            System.out.print("You are " + str[peo] + ((peo == com) ? " too. " : ". "));
            if (com == peo)
                System.out.println("It is a draw");
            else {
                if (peo - com == 1 || peo - com == -2) {
                    System.out.println("You won in this round");
                    numPeo++;
                } else {
                    System.out.println("You lost in this round");
                    numCom++;
                }
            }
        }
        if (numCom == 2)
            System.out.println("You lost this game");
        else
            System.out.println("You won this game");

    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
