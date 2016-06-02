package pers.crazymouse.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 6/2/16.
 */
public class Ex12_25 {
    public static void main(String[] args) {
        String URLString = "http://cs.armstrong.edu/liang/data/Salary.txt";

        ArrayList<Double> assistantList = new ArrayList<>();
        ArrayList<Double> associateList = new ArrayList<>();
        ArrayList<Double> fullList = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String level = input.next();
                double salary = input.nextDouble();
                switch (level) {
                    case "assistant":
                        assistantList.add(salary);
                        break;
                    case "associate":
                        associateList.add(salary);
                        break;
                    case "full":
                        fullList.add(salary);
                        break;
                }
            }
            double sumSalaryOfAssistant = sumOfArrayList(assistantList);
            double sumSalaryOfAssociate = sumOfArrayList(associateList);
            double sumSalaryOfFull = sumOfArrayList(fullList);
            double sumSalaryOfAll = sumSalaryOfAssistant + sumSalaryOfAssociate + sumSalaryOfFull;
            double countOfAll = assistantList.size() + associateList.size() + fullList.size();
            System.out.printf("Sum salary of assistant: %.2f Average salary of assistant: %.2f\n",
                    sumSalaryOfAssistant, sumSalaryOfAssistant / assistantList.size());
            System.out.printf("Sum salary of associate: %.2f Average salary of associate: %.2f\n",
                    sumSalaryOfAssociate, sumSalaryOfAssociate / associateList.size());
            System.out.printf("Sum salary of full: %.2f Average salary of full: %.2f\n",
                    sumSalaryOfFull, sumSalaryOfFull / fullList.size());
            System.out.printf("Sum salary of all: %.2f Average salary of all: %.2f\n",
                    sumSalaryOfAll, sumSalaryOfAll / countOfAll);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }

    public static double sumOfArrayList(ArrayList<Double> list) {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }
}
