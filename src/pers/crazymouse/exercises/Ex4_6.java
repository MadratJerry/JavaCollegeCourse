package pers.crazymouse.exercises;

public class Ex4_6 {
    public static void main(String[] args) {
        final double PI = 3.1415926535;
        double randomArr[] = new double[3];
        for (int i = 0; i < 3; i++)
            randomArr[i] = Math.random() * PI * 2;
        java.util.Arrays.sort(randomArr);
        double degree[] = new double[3];
        degree[0] = randomArr[1] - randomArr[0];
        degree[1] = randomArr[2] - randomArr[1];
        degree[2] = 2 * PI - (randomArr[2] - randomArr[0]);
        java.util.Arrays.sort(degree);
        for (double d : degree)
            System.out.print(d + " ");
    }
}
