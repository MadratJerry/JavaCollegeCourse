package pers.crazymouse.exercises;

import java.io.File;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_26 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Ex12_26 dir" +
                            "(in dictionary out/production/UniversityCourse/))"
            );
            System.exit(1);
        }
        File directory = new File(args[0]);
        if (directory.exists()) {
            System.out.println("Directory already exists.");
        } else {
            directory.mkdir();
        }
    }
}
