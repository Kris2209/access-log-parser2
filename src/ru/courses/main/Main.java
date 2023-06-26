package ru.courses.main;

//import ru.courses.birds.*;

import ru.courses.geometry.BrokenLine;
import ru.courses.geometry.BrokenLinePlusOnePoint;
import ru.courses.geometry.LengthMethod;
import ru.courses.geometry.Point;
import ru.courses.numbers.Fraction;

//import ru.courses.students.*;
//import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Point p1 = new Point(10, 2);
        Point p2 = new Point(5, 7);
        Point p3 = new Point(2, 8);
        Point p4 = new Point(4, 5);
        Point arrp[] = {p4, p2, p3, p1};
        BrokenLine bl1 = new BrokenLine(arrp);
        BrokenLinePlusOnePoint bl2 = new BrokenLinePlusOnePoint(arrp);
        LengthMethodForPrint(bl1, bl2);

        System.out.println(sumNum(2, new Fraction(3,5).fractionDivision(),2.3));
        System.out.println(sumNum(3.6, new Fraction(49,12).fractionDivision(),3,new Fraction(3,2).fractionDivision()));
        System.out.println(sumNum( new Fraction(1,3).fractionDivision(),1));

    }
    public static void LengthMethodForPrint(LengthMethod... LengthMethod) {
        for (int i = 0; i < LengthMethod.length; i++) {
            System.out.println(LengthMethod[i].sumLenghtArr());
        }
    }


    public static double sumNum(Number... num){
        double sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i].doubleValue();
        }
        return sum;
    }
}









