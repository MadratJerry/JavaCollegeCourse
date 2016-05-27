package pers.crazymouse.exercises;

public class Ex6_28 {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s\n", "p", "2^p-1");
        for (int i = 0; i < 15; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 2; i < 32; i++)
            if (isPrime((int) Math.pow(2, i) - 1))
                System.out.printf("%-8d%-8d\n", i, (int) Math.pow(2, i) - 1);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0)
                return false;
        return true;
    }
}
