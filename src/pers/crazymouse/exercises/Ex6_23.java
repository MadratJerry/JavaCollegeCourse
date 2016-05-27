package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        System.out.print("Enter the char: ");
        char a = input.nextLine().charAt(0);
        System.out.print(count(str, a));
    }

    public static int count(String str, char a) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a)
                sum++;
        return sum;
    }
}
