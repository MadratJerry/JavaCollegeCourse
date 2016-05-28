package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.IllegalTriangleException;
import pers.crazymouse.exercises.myclass.Point;
import pers.crazymouse.exercises.myclass.Triangle;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_5 {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle tri = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3));
    }
}
