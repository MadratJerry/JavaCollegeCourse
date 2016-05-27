package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_18 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++, System.out.println())
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
        for (int i = n; i > 0; i--, System.out.println())
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--)
                System.out.print((j <= i ? j : " ") + " ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print((j >= i ? j : " ") + " ");
            System.out.println();
        }
    }
}
