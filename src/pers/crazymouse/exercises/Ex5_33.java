package pers.crazymouse.exercises;

public class Ex5_33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++)
                sum += (i % j == 0) ? j : 0;
            if (sum == i)
                System.out.println(i);
        }
    }
}
