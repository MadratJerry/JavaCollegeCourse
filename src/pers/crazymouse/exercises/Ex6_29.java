package pers.crazymouse.exercises;

public class Ex6_29 {
    public static void main(String[] args) {
        int n = 1001;
        int primeArr[] = new int[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++)
            for (int j = 2; j <= n / i; j++)
                primeArr[j * i] = 1;
        for (int i = 2; i <= 998; i++)
            if (primeArr[i] == 0 && primeArr[i + 2] == 0)
                System.out.printf("(%d, %d)\n", i, i + 2);
    }
}
