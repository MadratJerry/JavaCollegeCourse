package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex3_27 {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.print("Enter a point's x- and y-coordinates: ");
        p.input();
        System.out.println("The point is "
                + ((p.getX() >= 0 && p.getY() >= 0 && 100 - 0.5 * p.getX() - p.getY() >= 0) ? "" : "not ")
                + "in the triangle");
    }
}
