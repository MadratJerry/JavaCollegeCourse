package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.IllegalTriangleException;
import pers.crazymouse.exercises.myclass.Triangle;

import java.util.Scanner;

/**
 * Created by crazymouse on 6/7/16.
 */
public class Ex13_1 {
    public static void main(String[] args) throws IllegalTriangleException {
        System.out.print("Enter three edges: ");
        Scanner input = new Scanner(System.in);
        Triangle tri = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.print("Enter a color: ");
        tri.setColor(input.next());
        System.out.print("Is filled: ");
        tri.setFilled(input.nextBoolean());
        System.out.printf("Area: %.2f Perimeter: %.2f Color: %s Is filled: %s",
                tri.getArea(), tri.getPerimeter(), tri.getColor(), tri.isFilled());
    }
}
