package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String transArr[] = {"first", "second", "third"};
        String city[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the %s city: ", transArr[i]);
            city[i] = input.nextLine();
        }
        java.util.Arrays.sort(city);
        System.out.print("The three cities in alphabetical order are");
        for (int i = 0; i < 3; i++)
            System.out.print(" " + city[i]);
    }
}
