package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_14 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_14 sourceFile" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        int scoreNum = 0;
        double scoreSum = 0;
        try (
                Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                double score = input.nextDouble();
                scoreSum += score;
                scoreNum++;
            }
        }

        System.out.printf("Sum: %.2f Average: %.2f", scoreSum, scoreSum / scoreNum);
    }
}
