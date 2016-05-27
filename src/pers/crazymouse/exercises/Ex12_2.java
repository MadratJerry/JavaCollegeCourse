package pers.crazymouse.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by crazymouse on 5/27/16.
 */
public class Ex12_2 {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter m: ");
                m = input.nextInt();
                System.out.print("Enter n: ");
                n = input.nextInt();
                System.out.println("The sum is " + m + n);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}
