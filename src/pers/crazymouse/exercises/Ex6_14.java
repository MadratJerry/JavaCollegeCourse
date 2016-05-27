package pers.crazymouse.exercises;

public class Ex6_14 {
    public static void main(String[] args) {
        System.out.printf("%-4s%16s\n", "i", "m(i)");
        for (int i = 1; i <= 22; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 1; i <= 901; i += 100)
            System.out.printf("%-4d%16.4f\n", i, m(i));
    }

    public static double m(int x) {
        double res = 0;
        for (int j = 1; j <= x; j++)
            res += Math.pow(-1, j + 1) / (double) (2 * j - 1);
        return 4 * res;
    }
}
