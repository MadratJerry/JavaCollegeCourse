package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        if (a1 < a2) {
            int t = a1;
            a1 = a2;
            a2 = t;
        }
        if (a3 >= a1)
            System.out.printf("%d %d %d", a2, a1, a3);
        else if (a3 <= a2)
            System.out.printf("%d %d %d", a3, a2, a1);
        else
            System.out.printf("%d %d %d", a2, a3, a1);
    }
}
