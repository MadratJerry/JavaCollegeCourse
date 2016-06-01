package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_12 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Ex12_12 sourceFile targetFile" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exist");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                if (s1.matches("^[{]$")) {
                    output.print(s1);
                } else {
                    output.println();
                    output.print(s1);
                }
            }
        }
    }
}
