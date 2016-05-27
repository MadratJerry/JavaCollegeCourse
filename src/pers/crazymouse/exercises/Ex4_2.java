package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.EarthPoint;

public class Ex4_2 {
    public static void main(String[] args) {
        EarthPoint p1 = new EarthPoint();
        EarthPoint p2 = new EarthPoint();
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        p1.input();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        p2.input();
        System.out.println("The distance between the two points is " + p1.getDistance(p2) + "km");
    }
}
