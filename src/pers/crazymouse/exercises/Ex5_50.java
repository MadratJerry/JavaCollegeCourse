package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_50 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int numUpperCase = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                numUpperCase++;
        System.out.println("The number of uppercase letters is " + numUpperCase);
    }
}
