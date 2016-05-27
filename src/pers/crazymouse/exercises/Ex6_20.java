package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(countLetters(str));
    }

    public static int countLetters(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                sum++;
        return sum;
    }
}
