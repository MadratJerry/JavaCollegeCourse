package pers.crazymouse.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_03.dat");
        if (file.exists()) {
            try (
                    FileInputStream input = new FileInputStream(file)
            ) {
                int sum = 0, value;
                while ((value = input.read()) != -1) {
                    sum += value;
                }
                System.out.println(sum);
            }
        }
    }
}
