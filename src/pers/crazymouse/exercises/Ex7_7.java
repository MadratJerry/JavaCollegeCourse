package pers.crazymouse.exercises;

public class Ex7_7 {
    public static void main(String[] args) {
        int hash[] = new int[10];
        for (int i = 0; i < 100; i++)
            hash[getRandomNumber(9)]++;
        for (int i = 0; i < 10; i++)
            if (hash[i] > 0)
                System.out.printf("%d occurs %d time" + (hash[i] > 1 ? "s" : "") + "\n", i, hash[i]);
    }

    public static int getRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
