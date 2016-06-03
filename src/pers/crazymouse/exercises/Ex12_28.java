package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by crazymouse on 6/3/16.
 */
public class Ex12_28 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_28 dir" +
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
                if (i.getName().matches("^Exercise[1-9]{1,}[0-9]{0,}_[0-9]{1,}$")) {
                    i.renameTo(new File(i.getParent() + "/" + formatWord(i.getName())));
                }
            }
        }
    }

    static String formatWord(String word) {
        word = word.substring(8);
        String[] numStr = word.split("_");
        return String.format("Exercise%02d_%s", Integer.parseInt(numStr[0]), numStr[1]);
    }
}
