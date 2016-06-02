package pers.crazymouse.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_21 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/crazymouse/Codes/Temp/SortedStrings.txt");

        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }

        ArrayList<String> sortedList = (ArrayList<String>) list.clone();
        boolean isSorted = true;
        sortedList.sort(String::compareTo);
        for (int i = 0, count = 0; i < list.size(); i++) {
            if (!sortedList.get(i).equals(list.get(i)) && count < 2) {
                System.out.println(list.get(i));
                count++;
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("It's sorted.");
        }
    }
}
