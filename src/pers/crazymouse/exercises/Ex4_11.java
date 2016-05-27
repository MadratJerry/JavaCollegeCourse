package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_11 {
    public static void main(String[] args) {
        String hexArr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "1", "A", "B", "C", "D", "E"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int num = input.nextInt();
        if (num >= 0 && num <= 15)
            System.out.println("The hex value is " + hexArr[num]);
        else
            System.out.println(num + "is an invalid input");
    }
}
