package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;


public class Ex10_4 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(p1.distance(p2));
    }
}

class MyPoint extends Point {
    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        super(x, y);
    }

    public double distance(MyPoint target) {
        return getDistance(target);
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}