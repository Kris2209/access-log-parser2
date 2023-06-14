package ru.сourses.geometry;
public class PointPlusOnePoint extends Point{
    int z;
    public PointPlusOnePoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public String toString() {
        return "{" + x + ";" + y +  ";" + z + '}';
    }
}
