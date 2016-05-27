package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_17 {
    private static Scanner input;

    public static void main(String[] args) {
        String str[] = {"scissor", "rock", "paper"};
        int com = GetRandomNumber(2);
        int peo = PrintAndGetInt("scissor (0), rock (1), paper (2): ");
        System.out.print("The computer is " + str[com] + ". ");
        System.out.print("You are " + str[peo] + ((peo == com) ? " too. " : ". "));
        if (com == peo)
            System.out.println("It is a draw");
        else {
            if (peo - com == 1 || peo - com == -2)
                System.out.println("You won");
            else
                System.out.println("You lost");
        }
    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        input = new Scanner(System.in);
        return input.nextInt();
    }
}
