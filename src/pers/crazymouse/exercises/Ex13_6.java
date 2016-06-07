package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Circle;
import pers.crazymouse.exercises.myclass.GeometricObject;
import pers.crazymouse.exercises.myclass.Point;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_6 {
    public static void main(String[] args) {
        Circle c1 = new Circle(Point.ORIGINPOINT, 1);
        Circle c2 = new Circle(Point.ORIGINPOINT, 2);
        System.out.println(GeometricObject.max(c1, c2).getArea());
    }
}
