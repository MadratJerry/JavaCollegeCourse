package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        int num = 0;
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++)
            if (s1.charAt(i) == s2.charAt(i))
                num++;
            else
                break;
        if (num == 0)
            System.out.println(s1 + " and " + s2 + "have no common prefix");
        else
            System.out.println("The common prefix is " + s1.substring(0, num));
    }
}
