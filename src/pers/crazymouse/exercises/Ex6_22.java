package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(sqrt(input.nextInt()));
    }

    public static double sqrt(long n) {
        double lastGuess = 1, nextGuess = 0;
        while (true) {
            nextGuess = (lastGuess + (double) n / lastGuess) / 2;
            if (Math.abs(nextGuess - lastGuess) < 0.00000001)
                break;
            lastGuess = nextGuess;
        }
        return nextGuess;
    }
}
