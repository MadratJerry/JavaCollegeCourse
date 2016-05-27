package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Triangle;

public class Ex2_19 {
    public static void main(String[] args) {
        Triangle x = new Triangle();
        System.out.print("Enter three points for a triangle: ");
        x.inputTriangle();
        System.out.printf("The area of the triangle is %.1f", x.getArea());
    }
}
