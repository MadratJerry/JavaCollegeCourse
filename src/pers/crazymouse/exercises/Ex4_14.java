package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String str = input.nextLine();
        char letter = str.charAt(0);
        int gradeArr[] = {4, 3, 2, 1, 0, 0};
        if ((letter >= 'A' && letter <= 'D') || letter == 'F')
            System.out.printf("The numeric value for grade %c is %d", letter, gradeArr[letter - 'A']);
        else
            System.out.printf("%c is an invalid grade", letter);
    }
}
