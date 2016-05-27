package pers.crazymouse.exercises;

public class Ex6_13 {
    public static void main(String[] args) {
        System.out.printf("%-2s%16s\n", "i", "m(i)");
        for (int i = 1; i <= 22; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 1; i <= 20; i++)
            System.out.printf("%-2d%16.4f\n", i, m(i));
    }

    public static double m(int x) {
        double sum = 0;
        for (int i = 1; i <= x; i++)
            sum += (double) i / (double) (i + 1);
        return sum;
    }
}
