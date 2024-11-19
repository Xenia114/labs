package ru.voronchihina.geometry;

public class Point3D extends point {
    private final double z;

    public Point3D(double x, double y, double z) {
        super(x, y); //берем из родительского класса
        this.z = z;
    }

    public String toString() {
        return String.format("(%f, %f, %f)", getX(), getY(), z);
    }
}
