package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;

public class Triangle extends GeometricObject implements GeometricContain<Triangle> {
    private Point[] p = new Point[3];
    private Segment edge[] = new Segment[3];
    private double perimeter;

    public Triangle() {

    }

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        edge[0] = new Segment(s1);
        edge[1] = new Segment(s2);
        edge[2] = new Segment(s3);
        if (!isLegal(edge)) {
            throw new IllegalTriangleException();
        }
        perimeter = Segment.sum(edge);
    }

    public Triangle(Point a, Point b, Point c) throws IllegalTriangleException {
        this(new Point[]{a, b, c});
    }

    public Triangle(Point[] p) throws IllegalTriangleException {
        for (int i = 0; i < p.length; i++) {
            this.p[i] = new Point(p[i]);
        }
        edge = getEdge(p);
        if (!isLegal(edge)) {
            throw new IllegalTriangleException();
        }
        perimeter = Segment.sum(edge);
    }

    public boolean isLegal(Segment edge[]) {
        for (int i = 0; i < edge.length; i++) {
            for (int j = i + 1; j < edge.length; j++) {
                if (edge[i].getLength() + edge[j].getLength() <= edge[3 - i - j].getLength())
                    return false;
            }
        }
        return true;
    }

    public void input() {
        for (int i = 0; i < 3; i++) {
            p[i] = new Point();
            p[i].input();
        }
    }

    public static Segment[] getEdge(Point[] p) {
        Segment edge[] = new Segment[3];
        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                edge[num++] = new Segment(p[i], p[j]);
            }
        }
        return edge;
    }

    public double getArea() {
        double s = perimeter;
        s /= 2;
        double area = s;
        for (int i = 0; i < 3; i++)
            area *= (s - edge[i].getLength());
        return Math.pow(area, 0.5);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public boolean contains(Triangle t) {
        return contains(t.p[0]) && contains(t.p[1]) && contains(t.p[2]);
    }

    public boolean contains(Point t) {
        // Check whether the point on the edge
        for (int i = 0; i < edge.length; i++) {
            if (edge[i].contains(t)) {
                return true;
            }
        }
        // Check whether the point within the graphics
        Segment imaLine[] = new Segment[3];
        for (int i = 0; i < p.length; i++) {
            imaLine[i] = new Segment(t, p[i]);
        }
        for (int i = 0; i < imaLine.length; i++) {
            int count = 0;
            for (int j = 0; j < edge.length; j++) {
                if (Segment.intersect(imaLine[i], edge[j])) {
                    count++;
                }
            }
            if (count == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean overlaps(Triangle t) {
        for (int i = 0; i < edge.length; i++) {
            for (int j = 0; j < t.edge.length; j++) {
                if (Segment.intersect(edge[i], t.edge[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
