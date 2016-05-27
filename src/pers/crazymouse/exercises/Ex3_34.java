package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex3_34 {
    public static void main(String[] args) {
        Point p0 = new Point();
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.print("Enter three points for p0, p1, and p2: ");
        p0.input();
        p1.input();
        p2.input();
        double key = (p1.getX() - p0.getX()) * (p2.getY() - p0.getY())
                - (p2.getX() - p0.getX()) * (p1.getY() - p0.getY());
        String pos;
        if (key == 0 && ((p2.getX() >= p0.getX() && p2.getX() <= p1.getX())
                || (p2.getX() >= p1.getX() && p2.getX() <= p0.getX())))
            pos = "on";
        else
            pos = "not on";
        System.out.printf("(%.1f, %.1f) is %s the line segment from (%.1f, %.1f) to (%.1f, %.1f)", p2.getX(), p2.getY(),
                pos, p0.getX(), p0.getY(), p1.getX(), p1.getY());
    }
}
