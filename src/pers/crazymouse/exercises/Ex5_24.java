package pers.crazymouse.exercises;

public class Ex5_24 {
    public static void main(String[] args) {
        double res = 0.0;
        for (int i = 3; i <= 99; i += 2)
            res += (double) (i - 2) / (double) i;
        System.out.println(res);
    }
}
