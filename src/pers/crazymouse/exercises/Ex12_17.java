package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_17 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        try (

                Scanner inputFile = new Scanner(new File("/Users/crazymouse/Codes/Temp/test.txt"))
        ) {
            while (inputFile.hasNext()) {
                wordList.add(inputFile.next());
            }
        }
//        String[] words = {"write", "that", "password", "wish", "hope", "insist"};

        boolean hash[];
        char yOrN = 'y';
        while (yOrN == 'y') {
            String word = wordList.get(getRandomNumber(wordList.size() - 1));
            hash = new boolean[word.length()];
            int missTime = 0;
            while (true) {
                System.out.print("(Guess) Enter a letter in word ");
                printWord(word, hash);
                System.out.print(" > ");
                char guess = input.nextLine().charAt(0);
                if (isAlreadyOrNot(word, guess, hash)) {
                    System.out.print("     " + guess + " is already in the word\n");
                } else {
                    System.out.print("     " + guess + " is not in the word\n");
                    missTime++;
                }
                if (isComplete(hash))
                    break;
            }
            System.out.printf("The word is %s. You missed %d time%s\n", word, missTime, (missTime > 1 ? "s" : ""));
            System.out.print("Do you want to guess another word? Enter y or n>");
            yOrN = input.nextLine().charAt(0);
        }
    }

    public static int getRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }

    public static void printWord(String str, boolean[] hash) {
        for (int i = 0; i < str.length(); i++)
            System.out.print(hash[i] ? str.charAt(i) : "*");
    }

    public static boolean isAlreadyOrNot(String word, char guess, boolean[] hash) {
        boolean res = false;
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                if (hash[i])
                    res = true;
                else {
                    res = true;
                    hash[i] = true;
                }
            }
        }
        return res;
    }

    public static boolean isComplete(boolean[] hash) {
        for (int i = 0; i < hash.length; i++)
            if (hash[i] == false)
                return false;
        return true;
    }
}
