package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        System.out.print(GCD(input.nextInt(), input.nextInt()));
    }

    public static int GCD(int a, int b) {
        return (b > 0) ? GCD(b, a % b) : a;
    }
}
