package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricContain;
import pers.crazymouse.exercises.myinterface.GeometricUbiety;

import java.util.Scanner;

public class Circle extends GeometricObject implements GeometricUbiety<Circle>, GeometricContain<Circle> {
    protected Point o;
    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double radius) {
        this(new Point(x, y), radius);
    }

    public Circle(Point o, double radius) {
        this.o = o;
        this.radius = radius;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        o.input();
        radius = input.nextDouble();

    }

    public int getUbiety(Circle target) {
        if (getCentralPointDistance(target) + radius <= target.getRadius()) {
            return 0;
        } else if (getCentralPointDistance(target) > radius + target.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean contains(double x, double y) {
        return contains(new Point(x, y));
    }

    public boolean contains(Point o) {
        return Point.getDistance(this.o, o) < getRadius();
    }

    public boolean contains(Circle circle) {
        return getUbiety(circle) == 0;
    }

    public double getCentralPointDistance(Circle target) {
        return o.getDistance(target.o);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
