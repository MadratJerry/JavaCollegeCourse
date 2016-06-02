package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_24 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/crazymouse/Codes/Temp/Salary.txt");

        String[] level = {"assistant", "associate", "full"};
        int[][] salaryLevel = {{50000, 80000}, {60000, 110000}, {75000, 130000}};
        try (
                PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 1000; i++) {
                int levelNum = getRandom(2);
                output.printf("FirstName%d LastName%d %s %.2f\n", i, i, level[levelNum],
                        getRandom(salaryLevel[levelNum][0], salaryLevel[levelNum][1]) + Math.random());
            }
        }
    }

    public static int getRandom(int x) {
        return (int) (Math.random() * (x + 1));
    }

    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
