package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;

/**
 * Created by crazymouse on 5/27/16.
 */
public class Segment extends Line implements GeometricContain<Point> {
    private double length;

    public Segment() {
        this(0, 0, 0, 0);
    }

    public Segment(double length) {
        this(0, 0, length, 0);
    }

    public Segment(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Segment(Point begin, Point end) {
        super(begin, end);
        length = begin.getDistance(end);
    }

    public double getLength() {
        return length;
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

    public static double sum(Segment... list) {
        double sum = 0;
        for (Segment i : list) {
            sum += i.getLength();
        }
        return sum;
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
