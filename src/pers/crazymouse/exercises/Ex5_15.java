package pers.crazymouse.exercises;

public class Ex5_15 {
    public static void main(String[] args) {
        for (int i = 33; i <= 126; i++) {
            System.out.print((char) i + " ");
            if ((i - 2) % 10 == 0)
                System.out.println();
        }
    }
}
