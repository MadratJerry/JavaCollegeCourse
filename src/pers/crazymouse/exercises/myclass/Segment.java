package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;

/**
 * Created by crazymouse on 5/27/16.
 */
public class Segment extends Line implements GeometricContain<Point> {
    public Segment() {
        super(0, 0, 0, 0);
    }

    public Segment(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    public Segment(Point begin, Point end) {
        super(begin, end);
    }

    public double getLength() {
        return begin.getDistance(end);
    }

    public boolean contains(Point t) {
        return super.contains(t) && isOnInterval(begin.getX(), end.getX(), t.getX());
    }

    public static boolean intersect(Line a, Line b) {
        if (intersectPoint(a, b) != null) {
            return a.contains(intersectPoint(a, b)) && b.contains(intersectPoint(a, b));
        } else {
            return a.begin.equals(b.begin) || a.begin.equals(b.end) || a.end.equals(b.begin) || a.end.equals(b.end);
        }
    }

    private boolean isOnInterval(double l, double r, double x) {
        if (r < l) {
            return isOnInterval(r, l, x);
        } else {
            return x >= l && x <= r;
        }
    }

    public String toString() {
        return String.format("[%s %s]", begin.toString(), end.toString());
    }
}
