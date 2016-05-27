package pers.crazymouse.exercises;

import java.util.Scanner;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();
        int num = input.nextInt();
        for (int i = 2; i <= num; i++)
            if (num % i == 0) {
                stack.add(i);
                num /= i;
                i = 1;
            }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
