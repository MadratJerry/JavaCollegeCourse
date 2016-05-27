package pers.crazymouse.exercises;

public class Ex6_27 {
    public static void main(String[] args) {
        int n = 10000;
        int primeArr[] = new int[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++)
            for (int j = 2; j <= n / i; j++)
                primeArr[j * i] = 1;
        for (int i = 2, count = 0; ; i++)
            if (primeArr[i] == 0 && isPalindrome(i) == false && primeArr[reverse(i)] == 0) {
                System.out.print(i + " ");
                if (++count == 100)
                    break;
                if (count % 10 == 0)
                    System.out.println();
            }
    }

    public static int reverse(int number) {
        int sum = 0;
        while (number != 0) {
            sum *= 10;
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
