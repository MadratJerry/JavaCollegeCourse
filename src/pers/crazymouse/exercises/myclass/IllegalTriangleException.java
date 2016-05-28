package pers.crazymouse.exercises.myclass;

/**
 * Created by crazymouse on 5/28/16.
 */
public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(double a, double b, double c) {
        super("Invalid edge: " + a + ", " + b + ", " + c);
    }
}
