package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_13 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_13 sourceFile" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        int lineNum = 0, wordNum = 0, charNum = 0;

        try (
                Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                wordNum += s1.split(" ").length - 1;
                lineNum++;
                charNum += s1.length();
            }
        }

        System.out.printf("Line: %d Word: %d Char: %d", lineNum, wordNum, charNum);
    }
}
