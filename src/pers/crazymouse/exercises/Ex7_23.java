package pers.crazymouse.exercises;

public class Ex7_23 {
    public static void main(String[] args) {
        int box[] = new int[100];
        for (int i = 0; i < 100; i++)
            for (int j = i + 1; j < 100; j += i + 1)
                box[j] = getOpposite(box[j]);
        System.out.println(java.util.Arrays.toString(box));
    }

    public static int getOpposite(int x) {
        if (x == 0)
            return 1;
        else
            return 0;
    }
}
