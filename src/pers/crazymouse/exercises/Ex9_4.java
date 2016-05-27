package pers.crazymouse.exercises;

public class Ex9_4 {
    public static void main(String[] args) {
        java.util.Random fool = new java.util.Random(1000);
        for (int i = 0; i < 50; i++)
            System.out.println(fool.nextInt(100));
    }
}
