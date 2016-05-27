package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sought = input.nextDouble();
        sought -= 5000;
        double money = 0;
        double rateArr[] = {0.08, 0.1, 0.12};
        double taxArr[] = {5000, 10000};
        double computeArr[] = {5000, 5000};
        double res = 0;
        for (int i = 0; i < 2; i++) {
            if (money + computeArr[i] * rateArr[i] < sought)
                money += computeArr[i] * rateArr[i];
            else
                res = (sought - money) / rateArr[i] + taxArr[i];
        }
        if (res == 0)
            res = (sought - money) / rateArr[2] + taxArr[1];
        System.out.println(res);
    }
}
