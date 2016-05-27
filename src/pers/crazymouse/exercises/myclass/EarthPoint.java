package pers.crazymouse.exercises.myclass;

public class EarthPoint extends Point {
    final double earthRadius = 6371.01;

    public double getRadiansX() {
        return Math.toRadians(getX());
    }

    public double getRadiansY() {
        return Math.toRadians(getY());
    }

    public double getDistance(EarthPoint target) {
        return earthRadius
                * Math.acos(Math.sin(getRadiansX()) * Math.sin(target.getRadiansX()) + Math.cos(getRadiansX())
                * Math.cos(target.getRadiansX()) * Math.cos(getRadiansY() - target.getRadiansY()));
    }
}
