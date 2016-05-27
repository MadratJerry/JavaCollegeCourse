package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex9_10 {
    public static void main(String[] args) {
        QuadraticEuation.printResult(new QuadraticEuation());
    }
}

class QuadraticEuation {
    private double a, b, c;

    QuadraticEuation() {
        input();
    }

    QuadraticEuation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        this.a = input.nextDouble();
        this.b = input.nextDouble();
        this.c = input.nextDouble();
    }

    public static void printResult(QuadraticEuation x) {
        System.out.println(x.getResult());
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.pow(getDiscriminant(), 0.5)) / 2;
        } else {
            return 0;
        }
    }

    public double getRoo2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.pow(getDiscriminant(), 0.5)) / 2;
        } else {
            return 0;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getResult() {
        if (getDiscriminant() > 0) {
            return String.format("r1 = %f, r2 = %f", getRoot1(), getRoo2());
        } else if (getDiscriminant() == 0) {
            return String.format("r = %f", getRoot1());
        } else {
            return "The quation has no roots";
        }
    }
}