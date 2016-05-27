package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        System.out.print("Enter an ASCII code: ");
        Scanner input = new Scanner(System.in);
        int ASCII = input.nextInt();
        System.out.printf("The character for ASCII code %d is %c", ASCII, ASCII);
    }
}
