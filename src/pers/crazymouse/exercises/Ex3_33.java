package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package1: ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package2: ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();
        int max = weight1 * weight2 / GCD(weight1, weight2);
        price1 *= (max / weight1);
        price2 *= (max / weight2);
        if (price1 > price2)
            System.out.println("Package 2 has a better price.");
        else if (price1 < price2)
            System.out.println("Package 1 has a better price.");
        else
            System.out.println("Two packages have the same price.");
    }

    public static int GCD(int a, int b) {
        return (b > 0) ? GCD(b, a % b) : a;
    }
}
