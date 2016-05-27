package pers.crazymouse.exercises;

public class Ex8_7 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
                {-1.5, 4, 2}, {5.5, 4, -0.5}};
        Point3D point[] = new Point3D[points.length];
        for (int i = 0; i < points.length; i++)
            point[i] = new Point3D(points[i][0], points[i][1], points[i][2]);
    }
}

class Point3D {
    public double x, y, z;

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(Point3D target) {
        return Math.pow(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2) + Math.pow(z - target.z, 2), 0.5);
    }
}
