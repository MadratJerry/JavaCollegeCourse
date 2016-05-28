package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.IllegalTriangleException;
import pers.crazymouse.exercises.myclass.Point;
import pers.crazymouse.exercises.myclass.Triangle;

import java.util.Scanner;

/**
 * Created by crazymouse on 5/27/16.
 */
public class Ex11_15 {
    public static void main(String[] args) throws IllegalTriangleException {
        System.out.print("Enter the number of the points: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Point pList[] = new Point[n];
        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < n; i++) {
            pList[i] = new Point().input();
        }
        Triangle[] triList = new Triangle[n - 2];
        for (int i = 0; i < n - 2; i++) {
            triList[i] = new Triangle(pList[0], pList[i + 1], pList[i + 2]);
        }
        double result = 0;
        for (Triangle tri : triList) {
            result += tri.getArea();
        }
        System.out.printf("The total area is %.3f", result);
    }
}
