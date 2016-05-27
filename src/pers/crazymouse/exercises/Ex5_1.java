package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        double sum = 0;
        int i = 0, numPos = 0, numNeg = 0;
        while (i++ >= 0) {
            int n = input.nextInt();
            if (n == 0)
                break;
            if (n < 0)
                numNeg++;
            if (n > 0)
                numPos++;
            sum += n;
        }
        System.out.println("The number of positives is " + numPos);
        System.out.println("The number of negatives is " + numNeg);
        System.out.printf("The total is %.1f\n", sum);
        System.out.printf("The average is %.2f\n", sum / (double) --i);
    }
}
