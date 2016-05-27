package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String binary = "";
        while (n != 0) {
            binary += n % 2 + "";
            n /= 2;
        }
        System.out.println(new StringBuffer(binary).reverse().toString());
    }
}
