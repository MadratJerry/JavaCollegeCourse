package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_30 {
    public static void main(String[] args) {
        System.out.print("Enter the number of values: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Enter the values: ");
        int values[] = new int[n];
        for (int i = 0; i < n; i++)
            values[i] = input.nextInt();
        System.out.print("The list has" + (isConsecutiveFour(values) ? "" : " no") + " consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 1, count = 1; i < values.length; i++) {
            if (values[i] == values[i - 1])
                count++;
            else
                count = 1;
            if (count == 4)
                return true;
        }
        return false;
    }
}
