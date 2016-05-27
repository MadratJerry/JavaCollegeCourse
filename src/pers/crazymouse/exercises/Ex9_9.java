package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex9_9 {
    public static void main(String[] args) {
        System.out.println(new RegularPolygon());
        System.out.println(new RegularPolygon(6, 4));
        System.out.println(new RegularPolygon(10, 4, new Point(5.6, 7.8)));
    }
}

class RegularPolygon {
    private int n;
    private double side;
    private Point o;

    RegularPolygon() {
        this(3, 1);
    }

    RegularPolygon(int n, int side) {
        this(n, side, new Point(0, 0));
    }

    RegularPolygon(int n, int side, Point o) {
        this.n = n;
        this.side = side;
        this.o = o;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return o.getX();
    }

    public double getY() {
        return o.getY();
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        o.setX(x);
    }

    public void setY(double y) {
        o.setY(y);
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (double) n * side * side / (4 * Math.tan(Math.toRadians(180 / n)));
    }

    public String toString() {
        return String.format("Perimeter: %f Area: %f", getPerimeter(), getArea());
    }
}
