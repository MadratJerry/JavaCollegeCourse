package pers.crazymouse.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_08.dat");
        int count;
        if (file.exists()) {
            try (
                    FileInputStream input = new FileInputStream(file)
            ) {
                count = input.read();
                count++;
            }
        } else {
            count = 1;
        }
        try (
                FileOutputStream output = new FileOutputStream(file)
        ) {
            output.write(count);
        }
    }
}
