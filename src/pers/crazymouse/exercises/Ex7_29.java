package pers.crazymouse.exercises;

public class Ex7_29 {
    public static void main(String[] args) {
        // String nameArr[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        // "10", "Jack", "Queen", "King" };
        int sum = 0, count = 0;
        while (sum != 24) {
            sum = 0;
            for (int i = 0; i < 4; i++)
                sum += getRandomNumber(51) / 4;
            count++;
        }
        System.out.print(count);
    }

    public static int getRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
