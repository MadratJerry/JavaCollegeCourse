package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_17 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++, System.out.println()) {
            for (int j = n; j > 0; j--)
                if (j <= i)
                    System.out.printf("%2d", j);
                else
                    System.out.printf("  ");
            for (int j = 2; j <= n; j++)
                if (j <= i)
                    System.out.printf("%2d", j);
                else
                    System.out.printf("  ");
        }
    }
}
