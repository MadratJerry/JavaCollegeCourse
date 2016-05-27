package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int list[] = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            list[count++] = input.nextInt();
            for (int j = 0; j < count - 1; j++)
                if (list[j] == list[count - 1]) {
                    count--;
                    break;
                }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++)
            System.out.print(list[i] + " ");
    }
}
