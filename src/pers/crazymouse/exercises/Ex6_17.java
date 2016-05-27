package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        printMatrix(input.nextInt());
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++, System.out.println())
            for (int j = 0; j < n; j++)
                System.out.print(GetRandomNumber(1) + " ");
    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
