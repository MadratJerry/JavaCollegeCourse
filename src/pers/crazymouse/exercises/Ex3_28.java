package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Rectangle;

public class Ex3_28 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        r1.input();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        r2.input();
        switch (r2.getUbiety(r1)) {
            case 0:
                System.out.println("r2 is inside r1");
                break;
            case 1:
                System.out.println("r2 overlaps r1");
                break;
            case -1:
                System.out.println("r2 does not overlap r1");
        }
    }
}
