package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String str = input.nextLine();
        java.util.regex.Pattern ISBN = java.util.regex.Pattern.compile("^[0-9]{12}$");
        if (ISBN.matcher(str).matches() == false)
            System.out.println(str + " is an invalid input");
        else {
            int res = 0;
            for (int i = 0; i < 12; i++)
                res += (str.charAt(i) - '0') * (i % 2 == 0 ? 1 : 3);
            res = (10 - res % 10) % 10;
            System.out.println("The ISBN-13 number is " + str + res);
        }
    }
}
