package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(sort(input.nextLine()));
    }

    public static String sort(String s) {
        char sortArr[] = s.toCharArray();
        java.util.Arrays.sort(sortArr);
        s = new String(sortArr);
        return s;
    }
}
