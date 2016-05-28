package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.IllegalTriangleException;
import pers.crazymouse.exercises.myclass.Point;
import pers.crazymouse.exercises.myclass.Triangle;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Ex10_12 {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle2D t1 = new Triangle2D(new Point(2.5, 2), new Point(4.2, 3), new Point(5, 3.5));
        System.out.println("Area: " + t1.getArea() + " Perimeter: " + t1.getPerimeter());
        System.out.println(t1.contains(new Point(3, 3)));
        System.out.println(t1.contains(new Triangle2D(new Point(2.9, 2), new Point(4, 1), new Point(1, 3.4))));
        System.out.println(t1.overlaps(new Triangle2D(new Point(2, 5.5), new Point(4, -3), new Point(2, 6.5))));
    }
}

class Triangle2D extends Triangle {
    Triangle2D() throws IllegalTriangleException {
        super(new Point(0, 0), new Point(1, 1), new Point(2, 5));
    }

    Triangle2D(Point a, Point b, Point c) throws IllegalTriangleException {
        super(a, b, c);
    }
}
