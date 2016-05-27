package pers.crazymouse.exercises;

public class Ex5_35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int x = 1; x <= 624; x++)
            sum += 1 / (Math.pow(x, 0.5) + Math.pow(x + 1, 0.5));
        System.out.println(sum);
    }
}
