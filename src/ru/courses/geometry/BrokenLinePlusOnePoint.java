package ru.courses.geometry;
public class BrokenLinePlusOnePoint extends BrokenLine implements LengthMethod {
    public BrokenLinePlusOnePoint(Point[] arr) {
        super(arr);
    }
    @Override
    public double sumLenghtArr() {
        double sum = super.sumLenghtArr();
        Point firstPoint = this.arr[0];
        Point lasttPoint = this.arr[this.arr.length - 1];
        sum += super.lengthBetween(firstPoint,lasttPoint);
        return sum;
    }
}

/* Ярослав помог
    public BrokenLinePlusOnePoint(Point[] arr2){
        super();
        super.arr = new Point[arr2.length +1];
        for (int i= 0; i < arr2.length; i++){
            super.arr[i] = arr2[i];
        }
       super.arr[arr2.length] = arr2[0];
    }


}

    public BrokenLinePlusOnePoint(Point[] arr2){
        this.arr = new Point[arr2.length +1];
        for (int i= 0; i < arr2.length; i++){
            arr[i] = arr2[i];
        }
        this.arr[arr2.length] = arr2[0];
    } */
