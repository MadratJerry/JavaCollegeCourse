package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_18 {
    public static void main(String[] args) {
        System.out.print("Enter a password: ");
        Scanner input = new Scanner(System.in);
        java.util.regex.Pattern password = java.util.regex.Pattern.compile("^[0-9a-zA-Z]{8,}$");
        String str = input.nextLine();
        boolean isTwice = false;
        for (int i = 0, count = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) {
                count++;
                if (count == 2)
                    isTwice = true;
            }
        System.out.println(
                str + " is " + (password.matcher(str).matches() && isTwice ? "a valid" : "an invalid") + " password");
    }
}
