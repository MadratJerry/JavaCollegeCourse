package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double edge[] = new double[3];
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            edge[i] = input.nextDouble();
            sum += edge[i];
        }
        boolean isLegal = true;
        for (int i = 0; i < 3; i++)
            for (int j = i + 1; j < 3; j++)
                if (edge[i] + edge[j] <= edge[3 - i - j])
                    isLegal = false;
        if (isLegal)
            System.out.println(sum);
        else
            System.out.println("It's illegal.");
    }
}
