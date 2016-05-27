package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_18 {
    private static Scanner input;

    public static void main(String[] args) {
        double rate[] = {3.5, 5.5, 8.5, 10.5};
        int computeArr[] = {1, 2, 7, 10};
        double price = 0.0;
        int weight = PrintAndGetInt("Enter the weight of package: ");
        if (weight > 20)
            System.out.println("the package cannot be shipped");
        else {
            for (int i = 0; ; i++) {
                if (i == 3 || weight < computeArr[i]) {
                    price += weight * rate[i];
                    break;
                } else {
                    price += computeArr[i] * rate[i];
                    weight -= computeArr[i];
                }
            }
            System.out.printf("The price is %.2f", price);
        }
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        input = new Scanner(System.in);
        return input.nextInt();
    }
}
