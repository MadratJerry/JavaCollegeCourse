package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_16 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + (n == i ? "" : ", "));
                n /= i;
                i = 1;
            }
        }
    }
}
