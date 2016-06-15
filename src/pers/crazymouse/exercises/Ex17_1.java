package pers.crazymouse.exercises;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_01.txt");
        if (!file.exists()) {
            try (
                    DataOutputStream output = new DataOutputStream(new FileOutputStream(file))
            ) {
                Random feed = new Random();
                for (int i = 0; i < 100; i++) {
                    output.writeChars(feed.nextInt() + "" + " ");
                }
            }
        }
    }
}
