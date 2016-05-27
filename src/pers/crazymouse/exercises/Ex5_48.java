package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++)
            System.out.print((i % 2 == 0 ? str.charAt(i) : ""));
    }
}
