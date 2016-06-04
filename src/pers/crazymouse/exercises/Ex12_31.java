package pers.crazymouse.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/4/16.
 */
public class Ex12_31 {
    public static void main(String[] args) {
        String url = "http://cs.armstrong.edu/liang";
        crawler(url);
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURls = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURls.add(startingURL);
        while (!listOfPendingURls.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURls.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURls.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.indexOf("Computer Programming") >= 0) {
                    System.out.println("Find Computer Programming in " + urlString);
                    System.exit(1);
                }
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
