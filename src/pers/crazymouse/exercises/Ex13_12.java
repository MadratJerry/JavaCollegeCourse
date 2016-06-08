package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Circle;
import pers.crazymouse.exercises.myclass.GeometricObject;
import pers.crazymouse.exercises.myclass.Rectangle;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_12 {
    public static void main(String[] args) {
        GeometricObject[] g = new GeometricObject[4];
        g[0] = new Circle(1);
        g[1] = new Rectangle(1, 2);
        g[2] = new Rectangle(2, 4);
        g[3] = new Circle(2);
        System.out.println(GeometricObject.sumArea(g));
    }
}
