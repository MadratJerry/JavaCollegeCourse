package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(reverse(input.nextInt()));
    }

    public static int reverse(int number) {
        int sum = 0;
        while (number != 0) {
            sum *= 10;
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
