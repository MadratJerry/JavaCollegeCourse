package pers.crazymouse.exercises.myclass;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon() {
        this(1);
    }

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.pow(2, 0.5)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
