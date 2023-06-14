package ru.сourses;

import ru.сourses.birds.*;
import ru.сourses.geometry.BrokenLine;
import ru.сourses.geometry.Line;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.PointPlusOnePoint;
import ru.сourses.numbers.Fraction;
import ru.сourses.students.RuleChet;
import ru.сourses.students.Student;
import ru.сourses.students.StudentTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,8);
        Point p3 = new Point(10,11);
        Point p4 = new Point(15,19);
        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);
        Line l3 = new Line(p2,p3);
        System.out.println(l3.toString());
        p2.x = 7;
        p2.y = 9;
        p3.x = 12;
        p3.y = 15;
        System.out.println(l3.toString());
        double sum_3line = (l1.lineLenght() + l2.lineLenght() + l3.lineLenght());
        System.out.println(sum_3line);


        System.out.println();
        double lineLenght = 0;
        Point p10 = new Point(1,5);
        Point p11 = new Point(2,8);
        Point p12 = new Point(5,3);
        Point p13 = new Point(8,9);
        Point[] pointArr = {p10, p11, p12, p13};
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        BrokenLine bl10 = new BrokenLine(pointArr);
        //Рассчитать длину Ломаной
        double brokenLineLenght = bl10.sumLenghtArr();
        System.out.println(brokenLineLenght);
        //Получить у Ломаной массив Линий
        Line[] arrLines = bl10.getArrLines();
        System.out.println(Arrays.toString(arrLines));
        //Рассчитать длину массива Линий
        for (Line l: arrLines){
            lineLenght += l.lineLenght();}
        System.out.println(lineLenght);
        //Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(brokenLineLenght==lineLenght);
        //Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}
        pointArr[1] = new Point(12,8);
        System.out.println(pointArr[1]);
        System.out.println(bl10);
        System.out.println(Arrays.toString(bl10.getArrLines()));


        System.out.println();
        System.out.println();
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        System.out.println(f1.plusFraction(f2).plusFraction(f3).minusInt(5));

        System.out.println();

        int[] grades = {5,5,4,3,5};
        int[] grades2 = {4,5,2};
        Student s = new Student("Alex", grades);
        s.setGrade(grades2);
        System.out.println(s.getGrade());

        System.out.println();
        PointPlusOnePoint p = new PointPlusOnePoint(1,4,2);
        System.out.println(p.toString());

        System.out.println();
        //ru.сourses.geometry.ru.сourses.geometry.BrokenLinePlusOnePoint bl = new ru.сourses.geometry.ru.сourses.geometry.BrokenLinePlusOnePoint(pointArr);
       // System.out.println(bl);

        System.out.println();

        Sparrow sp = new Sparrow();
        sp.singing();
        Cuckoo c = new Cuckoo();
        c.singing();
        Parrot parr = new Parrot("Привет, я Ара!");
        parr.singing();

        System.out.println();

        StudentTest st = new StudentTest("Alex", new RuleChet());
        st.addGrade(6);
        st.addGrade(7);
        st.addGrade(28);
        st.addGrade(10954322);
        System.out.println(st.toString());

        ru.сourses.numbers.Number n = new Fraction(3,2);




    }


}