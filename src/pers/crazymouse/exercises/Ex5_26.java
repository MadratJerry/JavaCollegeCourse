package pers.crazymouse.exercises;

public class Ex5_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double res = 1, tmp = 1;
            for (int j = 1; j <= i * 10000; j++) {
                tmp /= (double) j;
                res += tmp;
            }
            System.out.println(res);
        }
    }
}
