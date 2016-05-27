package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_49 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int numVowel = 0, numCons = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isVowel = false;
            char vowel[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            for (int j = 0; j < 10; j++)
                if (vowel[j] == str.charAt(i))
                    isVowel = true;
            if (Character.isLetter(str.charAt(i))) {
                if (isVowel)
                    numVowel++;
                else
                    numCons++;
            }
        }
        System.out.println("The number of vowels is " + numVowel);
        System.out.println("The number of consonants is " + numCons);
    }
}
