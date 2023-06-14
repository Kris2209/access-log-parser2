package ru.сourses.geometry;
class BrokenLinePlusOnePoint extends BrokenLine{
    public BrokenLinePlusOnePoint(Point[] arr2){
        int x = 0;
        this.arr = new Point[arr2.length +1];
        for (int i =0; i < arr.length; i++){
            arr[i] = arr2[i];
            x++;
        }
        this.arr[x] = arr2[0];
    }
}