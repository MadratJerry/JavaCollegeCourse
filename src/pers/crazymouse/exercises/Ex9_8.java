package pers.crazymouse.exercises;

public class Ex9_8 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan1.toString() + "\n" + fan2.toString());
    }
}

class Fan {
    public final static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int _speed;
    private boolean _on;
    private double _radius;
    private String _color;

    Fan() {
        _speed = SLOW;
        _on = false;
        _radius = 5;
        _color = "blue";
    }

    public void setSpeed(int x) {
        _speed = x;
    }

    public void setOn(boolean x) {
        _on = x;
    }

    public void setRadius(double x) {
        _radius = x;
    }

    public void setColor(String color) {
        _color = color;
    }

    public int getSpeed() {
        return _speed;
    }

    public boolean getOn() {
        return _on;
    }

    public double getRadius() {
        return _radius;
    }

    public String getColor() {
        return _color;
    }

    public String toString() {
        if (_on) {
            return String.format("Speed: %d Color: %s Radius: %f", _speed, _color, _radius);
        } else {
            return "fan is off " + String.format("Color: %s Radius: %f", _color, _radius);
        }
    }
}
