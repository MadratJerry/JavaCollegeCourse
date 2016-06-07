package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.*;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_5 {
    public static void main(String[] args) throws IllegalTriangleException {
        Circle c1 = new Circle(Point.ORIGINPOINT, 1);
        Circle c2 = new Circle(Point.ORIGINPOINT, 2);
        System.out.println(GeometricObject.max(c1, c2).getArea());
        Triangle tri1 = new Triangle(3, 3, 3);
        Triangle tri2 = new Triangle(4, 4, 4);
        System.out.println(GeometricObject.max(tri1, tri2).getArea());
        System.out.println(GeometricObject.max(c2, tri2).getArea());
    }
}
