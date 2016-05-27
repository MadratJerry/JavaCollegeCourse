package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Point;

public class Ex3_25 {
    public static void main(String[] args) {
        double xArr[] = new double[6];
        Point p[] = new Point[4];
        System.out.print("Enter ");
        for (int i = 0; i < 4; i++) {
            p[i] = new Point();
            System.out.printf("x%d, y%d" + (i == 3 ? ": " : ", "), i + 1, i + 1);
        }
        for (int i = 0; i < 4; i++)
            p[i].input();
        xArr[0] = p[0].getY() - p[1].getY();
        xArr[1] = -(p[0].getX() - p[1].getX());
        xArr[2] = p[2].getY() - p[3].getY();
        xArr[3] = -(p[2].getX() - p[3].getX());
        xArr[4] = xArr[0] * p[0].getX() + xArr[1] * p[0].getY();
        xArr[5] = xArr[2] * p[2].getX() + xArr[3] * p[2].getY();
        double deno = xArr[0] * xArr[3] - xArr[1] * xArr[2];
        if (deno == 0.0)
            System.out.println("The two lines are parallel");
        else {
            System.out.printf("The intersecting point is at (%.5f, %.5f)",
                    (xArr[4] * xArr[3] - xArr[1] * xArr[5]) / deno, (xArr[0] * xArr[5] - xArr[4] * xArr[2]) / deno);
        }
    }
}
