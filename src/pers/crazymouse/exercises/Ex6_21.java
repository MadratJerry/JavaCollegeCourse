package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                System.out.print(getNumber(str.charAt(i)));
            else
                System.out.print(str.charAt(i));
    }

    public static int getNumber(char uppercaseLetter) {
        int numArr[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        return numArr[uppercaseLetter - (Character.isUpperCase(uppercaseLetter) ? 'A' : 'a')];
    }
}
