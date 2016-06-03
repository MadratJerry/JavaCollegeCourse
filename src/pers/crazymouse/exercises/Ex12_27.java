package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by crazymouse on 6/3/16.
 */
public class Ex12_27 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_27 dir" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }
        ArrayList<File> fileList = new ArrayList<>();
        File file = new File(args[0]);
        if (file.isFile()) {
            fileList.add(file);
        } else if (file.getName().equals("*")) {
            for (File i : file.getParentFile().listFiles()) {
                fileList.add(i);
            }
        } else {
            System.out.println("File does not exist or is a folder.");
        }
        for (File i : fileList) {
            if (i.isFile()) {
                ArrayList<String> fileStr = new ArrayList<>();
                try (
                        Scanner input = new Scanner(i)
                ) {
                    while (input.hasNext()) {
                        fileStr.add(formatString(input.nextLine()));
                    }
                }

                try (
                        PrintWriter output = new PrintWriter(i)
                ) {
                    for (String str : fileStr) {
                        output.println(str);
                    }
                }
            }
        }
    }

    public static String formatString(String str) {
        Pattern pattern = Pattern.compile("Exercise[1-9]{1,}[0-9]{0,}_[1-9]{1,}[0-9]{0,}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str = str.replaceFirst("Exercise[1-9]{1,}[0-9]{0,}_[1-9]{1,}[0-9]{0,}", formatWord(matcher.group()));
        }
        return str;
    }

    public static String formatWord(String word) {
        word = word.substring(8);
        String[] numStr = word.split("_");
        return String.format("Exercise%02d_%02d", Integer.parseInt(numStr[0]), Integer.parseInt(numStr[1]));
    }
}
