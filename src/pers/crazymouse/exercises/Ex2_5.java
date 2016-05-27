package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int pay = input.nextInt();
        double rate = input.nextDouble();
        rate /= 100;
        System.out.printf("The gratuity is $%.2f and total is $%.2f", pay * rate, pay * (1 + rate));

    }
}
