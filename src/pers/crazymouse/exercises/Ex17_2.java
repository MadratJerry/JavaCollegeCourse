package pers.crazymouse.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_02.dat");
        if (!file.exists()) {
            try (
                    FileOutputStream output = new FileOutputStream(file)
            ) {
                Random feed = new Random();
                for (int i = 0; i < 100; i++) {
                    output.write(feed.nextInt());
                }
            }
        }
    }
}
