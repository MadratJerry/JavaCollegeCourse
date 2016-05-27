package pers.crazymouse.exercises;

public class Ex3_24 {
    public static void main(String[] args) {
        int card = getRandomNumber(51);
        String nameArr[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String colorArr[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        System.out.printf("The card you picked is %s of %s", nameArr[card / 4], colorArr[card % 4]);
    }

    public static int getRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }
}
