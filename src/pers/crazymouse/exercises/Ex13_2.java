package pers.crazymouse.exercises;

import java.util.ArrayList;

/**
 * Created by crazymouse on 6/7/16.
 */
public class Ex13_2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        int n = list.size(), i;
        while (n != 0) {
            i = (int) (Math.random() * n--);
            Number t = list.get(n);
            list.set(n, list.get(i));
            list.set(i, t);
        }
    }
}
