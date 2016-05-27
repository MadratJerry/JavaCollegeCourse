package pers.crazymouse.exercises;

public class Ex5_25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double res = 0;
            for (int j = 1; j <= i * 10000; j++)
                res += Math.pow(-1, j + 1) / (double) (2 * j - 1);
            System.out.println(4 * res);
        }
    }
}
