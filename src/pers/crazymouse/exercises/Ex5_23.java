package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double res = 0;
        for (int i = input.nextInt(); i >= 1; i--)
            res += 1 / (double) i;
        System.out.println(res);
    }
}
