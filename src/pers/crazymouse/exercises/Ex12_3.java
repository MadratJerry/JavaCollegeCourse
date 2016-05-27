package pers.crazymouse.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_3 {
    public static void main(String[] args) {
        int numList[] = new int[100];
        Random random = new Random(7);
        for (int i = 0; i < numList.length; i++) {
            numList[i] = random.nextInt();
        }
        System.out.print("Enter the index of the number: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        try {
            System.out.println(numList[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}
