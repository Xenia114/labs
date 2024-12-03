package ru.voronchihina.tochka;

public class point {
    private final double x;
    private final double y;
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}
