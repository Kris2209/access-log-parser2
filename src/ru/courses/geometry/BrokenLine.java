package ru.courses.geometry;

import java.util.Arrays;

public class BrokenLine implements LengthMethod {
    Point[] arr;

    public BrokenLine() {
    }

    public BrokenLine(Point[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(arr);
    }

    public Line[] getArrLines() {
        Line[] lines = new Line[arr.length - 1];
        if (arr.length >= 2) {
            for (int i = 0; i < lines.length; i++) {
                lines[i] = new Line(arr[i], arr[i + 1]);
            }
            return lines;
        }
        return lines;
    }

    public double sumLenghtArr() {
        Line[] arrLine = getArrLines();
        double res = 0;
        for (int i = 0; i < arrLine.length; i++) res += arrLine[i].lineLenght();
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        boolean res = true;
        int x = arr.length;
        for (int i = 0; i <= x; i++) {
            if (((BrokenLine) o).arr[i].equals(arr[i])) {
                res = true;
            } else res = false;
            break;
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public double lengthBetween(Point p1, Point p2) {
        double len1, len2;
        len1 = p1.x - p2.x;
        len2 = p1.y - p2.y;
        return Math.sqrt(len1 * len1 + len2 * len2);

    }
}


