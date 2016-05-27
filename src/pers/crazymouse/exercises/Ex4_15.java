package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        int numArr[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        System.out.print("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char letter = str.charAt(0);
        if (Character.isLetter(letter))
            System.out.println(
                    "The corresponding number is " + numArr[letter - (Character.isUpperCase(letter) ? 'A' : 'a')]);
        else
            System.out.println(letter + " is an invalid input");
    }
}
