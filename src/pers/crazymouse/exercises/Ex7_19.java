package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_19 {
    public static void main(String[] args) {
        System.out.print("Enter list: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int list[] = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = input.nextInt();
        System.out.println("The list is " + (isSorted(list) ? "already" : "not") + " sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++)
            if (list[i] > list[i + 1])
                return false;
        return true;
    }
}
