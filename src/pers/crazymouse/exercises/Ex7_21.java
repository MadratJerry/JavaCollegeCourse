package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        // int numBall = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numSlot = input.nextInt();
        int slot[] = new int[numSlot];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int loc = 0;
            for (int j = 0; j < numSlot; j++) {
                if (getRandomNumber(1) == 0)
                    loc--;
                else
                    loc++;
                if (loc < 0)
                    loc = 0;
                if (loc > numSlot - 1)
                    loc = numSlot - 1;
            }
            slot[loc]++;
            if (slot[loc] > max)
                max = slot[loc];
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < numSlot; j++) {
                if (slot[j] >= i)
                    System.out.print("0");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int getRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
