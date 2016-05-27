package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        System.out.print("The reversed string is " + new StringBuffer(input.nextLine()).reverse().toString());
    }
}
