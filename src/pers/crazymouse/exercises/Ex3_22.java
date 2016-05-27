package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex3_22 {
    public static void main(String[] args) {
        Point p = new Point();
        Point o = new Point();
        System.out.print("Enter a point with two coordinates: ");
        p.input();
        System.out.printf("Point (%.1f, %.1f)", p.getX(), p.getY());
        System.out.print(" is" + (p.getDistance(o) <= 10 ? " " : " not ") + "in the circle");
    }
}
