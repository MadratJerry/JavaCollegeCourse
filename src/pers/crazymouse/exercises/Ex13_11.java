package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Octagon;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon(5);
        System.out.printf("Area: %.2f Perimeter: %.2f\n", o1.getArea(), o1.getPerimeter());
        Octagon o2 = (Octagon) o1.clone();
        System.out.println(o1.compareTo(o2));
    }
}
