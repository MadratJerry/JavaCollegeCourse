package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String str = input.nextLine();
        System.out.printf("The Unicode for the character %c is %d", str.charAt(0), (int) str.charAt(0));
    }
}
