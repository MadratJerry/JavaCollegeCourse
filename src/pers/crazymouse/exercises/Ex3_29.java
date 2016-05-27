package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Circle;

public class Ex3_29 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        c1.input();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        c2.input();
        switch (c2.getUbiety(c1)) {
            case 0:
                System.out.println("circle2 is inside circle1");
                break;
            case 1:
                System.out.println("circle2 overlaps circle1");
                break;
            case -1:
                System.out.println("circle2 does not overlap circle1");
        }
    }
}
