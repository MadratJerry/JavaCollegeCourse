package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex3_23 {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.print("Enter a point with two coordinates: ");
        p.input();
        System.out.printf("Point (%.1f, %.1f)", p.getX(), p.getY());
        System.out.print(
                " is" + ((Math.abs(p.getX()) <= 5 && Math.abs(p.getY()) <= 2.5) ? " " : " not ") + "in the rectangle");
    }
}
