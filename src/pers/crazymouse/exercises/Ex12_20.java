package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_20 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_20 srcRootDirectory" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File directory = new File("/Users/crazymouse/Codes/Temp/" + args[0]);
        if (directory.exists() && !directory.isFile()) {
            for (File tmp : directory.listFiles()) {
                if (tmp.getName().matches("chapter[0-9]{1,}")) {
                    File targetDir = tmp.getAbsoluteFile();
                    for (File file : targetDir.listFiles()) {
                        if (file.isFile() && file.canWrite() &&
                                file.getName().matches("[~!@#$%^&*()_+A-Za-z]{1,}.java")) {
                            delLine(file, "package " + directory.getName() + "." + tmp.getName() + ";");
                        }
                    }
                }
            }
        } else {
            System.out.println("The directory is not exist.");
        }
    }

    public static void delLine(File sourceFile, String addStr) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                String str = input.nextLine();
                if (str.equals(addStr)) {
                    continue;
                }
                list.add(str);
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
