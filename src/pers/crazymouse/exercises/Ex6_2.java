package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(sumDigits(input.nextInt()));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
