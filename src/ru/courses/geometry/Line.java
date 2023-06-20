package ru.courses.geometry;

import java.util.Objects;

public class Line implements Cloneable{
      public Point p1,p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(int x, int y, int x2, int y2){
        this.p1 = new Point(x,y);
        this.p2 = new Point(x2,y2);

    }
    public double lineLenght(){
        int x3 = p2.x - p1.x;
        int y3 = p2.y - p1.y;
        return Math.sqrt((x3*x3)+(y3*y3));
    }

    @Override
    public String toString() {
        return "Линия от " + p1.toString() + " до " +  p2.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(p1, line.p1) && Objects.equals(p2, line.p2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line l = (Line)super.clone();
        l = new Line(p1, p2);
        return l;
    }
}




