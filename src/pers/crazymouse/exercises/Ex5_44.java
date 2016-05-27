package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0)
            n += (1 << 16);
        int binary[] = new int[16 + 1];
        while (n != 0) {
            binary[++binary[0]] = n % 2;
            n /= 2;
        }
        for (int i = 16; i > 0; i--)
            System.out.print(binary[i]);
    }
}
