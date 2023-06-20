package ru.courses.geometry;
public class BrokenLinePlusOnePoint extends BrokenLine{

    public BrokenLinePlusOnePoint(Point[] arr2){
        super();
        super.arr = new Point[arr2.length +1];
        for (int i= 0; i < arr2.length; i++){
            super.arr[i] = arr2[i];
        }
       super.arr[arr2.length] = arr2[0];
    }

}

   /* public BrokenLinePlusOnePoint(Point[] arr2){
        this.arr = new Point[arr2.length +1];
        for (int i= 0; i < arr2.length; i++){
            arr[i] = arr2[i];
        }
        this.arr[arr2.length] = arr2[0];
    } */
