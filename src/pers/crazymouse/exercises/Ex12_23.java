package pers.crazymouse.exercises;

import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_23 {
    public static void main(String[] args) {
        String URLString = "http://cs.armstrong.edu/liang/data/Scores.txt";

        int scoreNum = 0;
        double scoreSum = 0;
        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                double score = input.nextDouble();
                scoreSum += score;
                scoreNum++;
            }

            System.out.printf("Sum: %.2f Average: %.2f", scoreSum, scoreSum / scoreNum);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
