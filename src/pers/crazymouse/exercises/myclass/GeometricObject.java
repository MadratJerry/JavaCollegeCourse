package pers.crazymouse.exercises.myclass;

import java.util.Date;

/**
 * Created by crazymouse on 5/26/16.
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("white", false);
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public int compareTo(GeometricObject o) {
        return compare(this, o);
    }

    public int compare(GeometricObject o1, GeometricObject o2) {
        if (o1.getArea() < o2.getArea()) {
            return -1;
        } else if (o1.getArea() > o2.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static GeometricObject max(GeometricObject t1, GeometricObject t2) {
        if (t1.compareTo(t2) < 0) {
            return t2;
        } else {
            return t1;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
