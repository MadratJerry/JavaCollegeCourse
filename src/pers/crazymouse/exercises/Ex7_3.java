package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {
        int hash[] = new int[100 + 1];
        System.out.print("Enter the integers between 1 and 100: ");
        Scanner input = new Scanner(System.in);
        for (int ch = -1; ch != 0; ) {
            ch = input.nextInt();
            hash[ch]++;
        }
        for (int i = 1; i <= 100; i++)
            if (hash[i] > 0)
                System.out.printf("%d occurs %d time" + (hash[i] > 1 ? "s" : "") + "\n", i, hash[i]);
    }
}
