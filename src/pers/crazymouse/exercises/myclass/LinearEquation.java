package pers.crazymouse.exercises.myclass;

import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        this(0, 0, 0, 0, 0, 0);
    }

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public static void input(LinearEquation x) {
        Scanner input = new Scanner(System.in);
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        x.d = input.nextDouble();
        x.e = input.nextDouble();
        x.f = input.nextDouble();

    }

    public static void printResult(LinearEquation x) {
        if (x.isSolve())
            System.out.printf("x: %.2f, y: %.2f", x.getX(), x.getY());
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolve() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
