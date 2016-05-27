package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayPattern(input.nextInt());
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--)
                System.out.print((j <= i ? j : " ") + " ");
            System.out.println();
        }
    }
}
