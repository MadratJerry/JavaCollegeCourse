package pers.crazymouse.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_5 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_05.dat");
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))
        ) {
            int[] array = new int[]{1, 2, 3, 4, 5};
            Date currentDate = new Date();
            double num = 5.5;
            output.writeObject(array);
            output.writeObject(currentDate);
            output.writeObject(num);
        }
    }
}
