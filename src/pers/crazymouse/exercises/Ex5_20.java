package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int primeArr[] = new int[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++)
            for (int j = 2; j <= n / i; j++)
                primeArr[j * i] = 1;
        for (int i = 2, num = 0; i <= n; i++) {
            if (primeArr[i] == 0) {
                System.out.printf("%4d ", i);
                if (++num % 8 == 0)
                    System.out.println();
            }
        }
    }
}
