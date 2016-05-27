package pers.crazymouse.exercises;

public class Ex6_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            System.out.print(getRandomCharacter('A', 'Z') + (i % 10 == 0 ? "\n" : ""));
        for (int i = 1; i <= 100; i++)
            System.out.print(getRandomCharacter('0', '9') + (i % 10 == 0 ? "\n" : ""));

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
