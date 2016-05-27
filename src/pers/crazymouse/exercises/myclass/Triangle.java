package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;

public class Triangle extends GeometricObject implements GeometricContain<Triangle> {
    private Point[] p = new Point[3];
    private Segment edge[] = new Segment[3];
    private double perimeter;

    public Triangle() {

    }

    public Triangle(Point a, Point b, Point c) {
        this(new Point[]{a, b, c});
    }

    public Triangle(Point[] p) {
        for (int i = 0; i < p.length; i++) {
            this.p[i] = new Point(p[i]);
        }
        makeEdge();
    }

    public void inputTriangle() {
        for (int i = 0; i < 3; i++) {
            p[i] = new Point();
            p[i].input();
        }
    }

    private void makeEdge() {
        perimeter = 0;
        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                edge[num++] = new Segment(p[i], p[j]);
                perimeter += edge[num - 1].getLength();
            }
        }
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
