package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/1/16.
 */
public class Ex12_15 {
    public static void main(String[] args) throws IOException {
        File targetFile = new File("/Users/crazymouse/Codes/Temp/test.txt");
        try (
                PrintWriter output = new PrintWriter(targetFile)
        ) {
            Random feed = new Random(7);
            for (int i = 0; i < 100; i++) {
                output.print(feed.nextInt(100) + " ");
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(targetFile)
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }

            list.sort((o1, o2) -> o1 - o2);

            for (int i : list) {
                System.out.print(i + " ");
            }
        }
    }
}
