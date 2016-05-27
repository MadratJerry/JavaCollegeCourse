package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_9 {
    public static void main(String[] args) {
        int num = PrintAndGetInt("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = num;
        int p = 9, sum = 0;
        while (num != 0) {
            sum += (num % 10) * (p--);
            num /= 10;
        }
        for (int i = 1; i <= p; i++)
            System.out.print(0);
        System.out.print(isbn);
        System.out.println(((sum % 11) == 10) ? "X" : sum % 11);

    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
