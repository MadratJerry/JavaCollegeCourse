package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.MyStack;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack s1 = new MyStack();
        s1.push("1");
        s1.push("2");
        MyStack s2 = (MyStack) s1.clone();
        s1.push("3");
        System.out.println(s2.toString());
    }
}
