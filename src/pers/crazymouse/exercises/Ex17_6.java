package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Loan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_6 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_06.dat");
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            Loan[] loan = new Loan[5];
            for (int i = 0; i < 5; i++) {
                loan[i] = new Loan(1, 1, 1);
                output.writeObject(loan[i]);
            }
        }
    }
}
