package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Line implements GeometricContain<Point> {
    protected Point begin, end;

    public Line() {
        this(0, 0, 0, 0);
    }

    public Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Line(Point begin, Point end) {
        this.begin = new Point(begin);
        this.end = new Point(end);
    }

    public static Point intersectPoint(Line a, Line b) {
        LinearEquation cramer = new LinearEquation(
                a.begin.getY() - a.end.getY(),
                -(a.begin.getX() - a.end.getX()),
                b.begin.getY() - b.end.getY(),
                -(b.begin.getX() - b.end.getX()),
                (a.begin.getY() - a.end.getY()) * a.begin.getX() - (a.begin.getX() - a.end.getX()) * a.begin.getY(),
                (b.begin.getY() - b.end.getY()) * b.begin.getX() - (b.begin.getX() - b.end.getX()) * b.begin.getY());
        if (cramer.isSolve()) {
            return new Point(cramer.getX(), cramer.getY());
        } else {
            return null;
        }
    }

    public static boolean intersect(Line a, Line b) {
        return intersectPoint(a, b) != null || a.contains(b.begin);
    }

    public boolean contains(Point t) {
//        return (t.getY() - begin.getY()) / (end.getY() - begin.getY()) ==
//                (t.getX() - begin.getX()) / (end.getX() - begin.getX());
        return (t.getX() - begin.getX()) * (end.getY() - begin.getY()) ==
                (t.getY() - begin.getY()) * (end.getX() - begin.getX());
    }
}
