package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_13 {
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (Character.isLetter(word.charAt(0))) {
            boolean isVowel = false;
            char vowel[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            for (int i = 0; i < 10; i++)
                if (vowel[i] == word.charAt(0))
                    isVowel = true;
            if (isVowel) {
                System.out.println(word.charAt(0) + " is a vowel");
            } else {
                System.out.println(word.charAt(0) + " is a consonant");
            }
        } else {
            System.out.println(word.charAt(0) + "is an invalid input");
        }
    }
}
