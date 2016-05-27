package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for (int max = input.nextInt(), count = 1; ; ) {
            int n = input.nextInt();
            if (n == 0) {
                System.out.println("The largest number is " + max);
                System.out.println("The occurrence count of the largest number is " + count);
                break;
            }
            if (n == max)
                count++;
            if (n > max) {
                max = n;
                count = 1;
            }
        }
    }
}
