package pers.crazymouse.exercises;

public class Ex5_19 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("    ");
            for (int j = 1; j <= i; j++)
                System.out.printf("%4.0f", Math.pow(2, j - 1));
            for (int j = i - 1; j > 0; j--)
                System.out.printf("%4.0f", Math.pow(2, j - 1));
            System.out.println();
        }
    }
}
