package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String binary = "";
        while (n != 0) {
            binary += n % 8 + "";
            n /= 8;
        }
        System.out.println(new StringBuffer(binary).reverse().toString());
    }
}
