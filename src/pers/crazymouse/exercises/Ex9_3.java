package pers.crazymouse.exercises;

public class Ex9_3 {
    public static void main(String[] args) {
        for (long i = 10000; i <= 100000000000L; i *= 10)
            System.out.println(new java.util.Date(i).toString());
    }
}
