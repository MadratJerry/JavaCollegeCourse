package pers.crazymouse.exercises;

import java.util.ArrayList;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_3 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Ex13_2.shuffle(list);
        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        list.sort((o1, o2) -> (int) o1 - (int) o2);
    }
}
