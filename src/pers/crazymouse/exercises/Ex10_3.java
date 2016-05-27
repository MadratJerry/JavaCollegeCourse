package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.MyInteger;

public class Ex10_3 {
    public static void main(String[] args) {
        MyInteger integer1 = new MyInteger(17);
        System.out.println(integer1.isEven() + " " + integer1.isOdd() + " " + integer1.isPrime());
        System.out.println(MyInteger.parseInt(new char[]{'1', '2', '3'}));
    }
}

