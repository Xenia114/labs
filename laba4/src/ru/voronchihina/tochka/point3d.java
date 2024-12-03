package ru.voronchihina.tochka;

public class point3d extends point {
    private final double z;
    public point3d(double x, double y, double z) {
        super(x, y); //берем из родительского класса
        this.z = z;
    }
    public String toString() {
        return String.format("(%f, %f, %f)", getX(), getY(), z);
    }
}

