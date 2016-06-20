package pers.crazymouse.exercises;

import java.io.*;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_4 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Ex17_4 Welcome.java Welcome.utf" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File("file/" + args[0]);
        File targetFile = new File("file/" + args[1]);
        if (sourceFile.exists()) {
            try (DataInputStream input = new DataInputStream(new FileInputStream(sourceFile));
                 DataOutputStream output = new DataOutputStream(new FileOutputStream(targetFile))) {
                output.writeUTF(input.readLine());
            }
            System.out.println(sourceFile.length());
            System.out.println(targetFile.length());
        }
    }
}
