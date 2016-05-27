package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        System.out.printf("Enter" + n + "score" + (n == 1 ? ": " : "s: "));
        int score[] = new int[n];
        int best = 0;
        for (int i = 0; i < n; i++) {
            score[i] = input.nextInt();
            if (score[i] > best)
                best = score[i];
        }
        for (int i = 0; i < n; i++)
            System.out.printf("Student %d score is %d and grade is %c\n", i, score[i], getGrade(score[i], best));
    }

    public static char getGrade(int score, int best) {
        for (int i = 1; i <= 4; i++)
            if (score >= best - i * 10)
                return (char) (64 + i);
        return 'F';
    }
}
