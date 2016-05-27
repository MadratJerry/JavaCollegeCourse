package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_28 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < 10; i++)
            num[i] = input.nextInt();
        for (int i = 0; i < 9; i++)
            for (int j = i; j < 10; j++)
                System.out.printf("(%d, %d)\n", num[i], num[j]);
    }
}
