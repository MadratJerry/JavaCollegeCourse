package pers.crazymouse.exercises;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Ex12_16 sourceFile oldStr newStr" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                list.add(s2);
            }
        }

        try (
                PrintWriter output = new PrintWriter(sourceFile)
        ) {
            for (String str : list) {
                output.println(str);
            }
        }
    }
}
