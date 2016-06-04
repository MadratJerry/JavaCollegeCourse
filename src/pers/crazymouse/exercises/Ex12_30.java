package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/4/16.
 */
public class Ex12_30 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a file name(absolute path): ");
        File file = new File(new Scanner(System.in).nextLine());
        int[] countUpperCase = new int[26];
        int[] countLowerCase = new int[26];
        if (file.exists()) {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                for (char i : input.nextLine().toCharArray()) {
                    if (Character.isUpperCase(i)) {
                        countUpperCase[i - 'A']++;
                    }
                    if (Character.isLowerCase(i)) {
                        countLowerCase[i - 'a']++;
                    }
                }
            }

            for (int i = 0; i < 26; i++) {
                System.out.printf("Number of %c's: %d\n", 'A' + i, countUpperCase[i]);
            }
            for (int i = 0; i < 26; i++) {
                System.out.printf("Number of %c's: %d\n", 'a' + i, countLowerCase[i]);
            }
        }
    }
}
