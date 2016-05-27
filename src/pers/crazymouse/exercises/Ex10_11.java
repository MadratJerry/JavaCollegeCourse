package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Circle;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Ex10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + c1.getArea() + " Perimeter: " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D extends Circle {

    Circle2D(double x, double y, double radius) {
        super(x, y, radius);
    }

    boolean overlaps(Circle2D circle) {
        return getUbiety(circle) != -1;
    }
}