package pers.crazymouse.exercises.myclass;

import pers.crazymouse.exercises.myinterface.Colorable;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Square extends Rectangle implements Colorable {

    public Square() {
        this(1);
    }

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
