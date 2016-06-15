package pers.crazymouse.exercises;

import java.io.*;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_10 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Ex17_10 SourceFile numberOfPieces" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does note exist");
            System.exit(2);
        } else {
            long size = sourceFile.length();
            long piece = size / Integer.parseInt(args[1]);
            try (
                    BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile))
            ) {
                int r, count = 1;
                while (count <= Integer.parseInt(args[1])) {
                    int numberOfBytes = 0;
                    try (
                            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(
                                    new File(sourceFile.getAbsolutePath() + "." + count++ + "")))
                    ) {
                        while ((r = input.read()) != -1 && numberOfBytes <= piece) {
                            output.write((byte) r);
                            numberOfBytes++;
                        }
                    }
                }
            }
        }
    }
}
