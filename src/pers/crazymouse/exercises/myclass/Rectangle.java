package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.GeometricUbiety;

import java.util.Scanner;

public class Rectangle extends GeometricObject implements GeometricUbiety<Rectangle> {
    private Point o = new Point();
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1, 1);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        o.input();
        width = input.nextDouble();
        height = input.nextDouble();

    }

    public int getUbiety(Rectangle target) {
        if (getCentralPointDistanceX(target) + width / 2 <= target.getWidth()) {
            if (getCentralPointDistanceY(target) + height / 2 <= target.getHeight())
                return 0;
            else
                return 1;
        } else if (getCentralPointDistanceY(target) + height / 2 <= target.getHeight())
            return 1;
        else
            return -1;
    }

    public double getCentralPointDistanceX(Rectangle target) {
        return o.getDistanceX(target.o);
    }

    public double getCentralPointDistanceY(Rectangle target) {
        return o.getDistanceY(target.o);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public String toString() {
        return String.format("Width: %.2f, height: %.2f, area: %.2f, perimeter: %.2f", width, height, getArea(),
                getPerimeter());
    }
}
