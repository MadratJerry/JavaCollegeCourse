package pers.crazymouse.exercises.myclass;

import java.util.Scanner;

public class Point implements Cloneable {
    private double x, y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();

    }

    public static double getDistance(Point a, Point b) {
        return Math.pow(getDistanceX(a, b) * getDistanceX(a, b) + getDistanceY(a, b) * getDistanceY(a, b), 0.5);
    }

    public double getDistance(Point t) {
        return getDistance(this, t);
    }

    public static double getDistanceX(Point a, Point b) {
        return Math.abs(a.getX() - b.getX());
    }

    public static double getDistanceY(Point a, Point b) {
        return Math.abs(a.getY() - b.getY());
    }

    public double getDistanceX(Point t) {
        return getDistanceX(this, t);
    }

    public double getDistanceY(Point t) {
        return getDistanceY(this, t);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    public boolean equals(Point t) {
        return t.getX() == getX() && t.getY() == getY();
    }
}
