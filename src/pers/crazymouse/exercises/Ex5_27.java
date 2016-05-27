package pers.crazymouse.exercises;

public class Ex5_27 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 101; i <= 2100; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.print(i + " ");
                if (++num % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println("\n" + num);
    }
}
