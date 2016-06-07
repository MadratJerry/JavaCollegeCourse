package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.*;
import pers.crazymouse.exercises.myinterface.Colorable;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_7 {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] g = new GeometricObject[5];
        g[0] = new Circle(1);
        g[1] = new Rectangle(1, 2);
        g[2] = new Triangle(3, 3, 3);
        g[3] = new Square(1);
        g[4] = new Square(2);
        for (int i = 0; i < 5; i++) {
            if (g[i] instanceof Colorable) {
                ((Colorable) g[i]).howToColor();
            }
        }
    }
}
