package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_21 {
    public static void main(String[] args) {
        System.out.print("Enter a SSN: ");
        Scanner input = new Scanner(System.in);
        java.util.regex.Pattern SSN = java.util.regex.Pattern.compile("^[0-9]{3}-[0-9]{2}-[0-9]{4}$");
        String str = input.nextLine();
        System.out.println(
                str + " is " + (SSN.matcher(str).matches() ? "a valid" : "an invalid") + "social security number");
    }
}
