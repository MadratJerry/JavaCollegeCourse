package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_22 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Ex12_22 dir oldStr newStr" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File directory = new File(args[0]);
        if (!directory.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                replaceString(file, args[1], args[2]);
            }
        }
    }

    public static void replaceString(File sourceFile, String oldStr, String newStr) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(oldStr, newStr);
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
