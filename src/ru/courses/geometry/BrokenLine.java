package ru.courses.geometry;

import java.util.Arrays;

public class BrokenLine {
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
        for (int i = 0; i<=x; i++){
            if (((BrokenLine) o).arr[i].equals(arr[i])){
               res = true;
            }
            else res = false;
            break;
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}

