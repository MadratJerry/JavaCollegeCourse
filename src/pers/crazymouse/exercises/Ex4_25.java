package pers.crazymouse.exercises;

public class Ex4_25 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            System.out.printf("%c", GetRandomNumber(25) + 'A');
        for (int i = 0; i < 4; i++)
            System.out.print(GetRandomNumber(9));
    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
