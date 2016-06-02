package pers.crazymouse.exercises;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_19 {
    public static void main(String[] args) throws IOException {
        String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";

        int wordNum = 0;
        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String s1 = input.nextLine();
                wordNum += s1.split(" ").length - 1;
            }

            System.out.println(wordNum);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
