package ru.courses.students;

import java.util.Arrays;

public class Student {
    private final String name;
    private int[] grade;

    public Student(String name, int[] grade) {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < 2 || grade[i] > 5) {
                throw new IllegalArgumentException("Оценка не может быть меньше 2 или больше 5");
            }}
            this.name = name;
            this.grade = grade;
    }

       public Student(String name) {
        this.name = name;
    }

    public Student getGrade() {
        return new Student(this.name, this.grade);
    }
     public void setGrade(int[] grade) {
        Student s = new Student(this.name, grade);
        if (this.grade != null) {
            int[] res = new int[this.grade.length + grade.length];
            int z = 0;
            for (int x = 0; x < this.grade.length; x++) {
                res[x] = this.grade[x];
                z++;
            }
            for (int x = 0; x < grade.length; x++) {
                res[z] = grade[x];
                z++;
            }
            this.grade = res;
        }
        else this.grade = grade;
    }
    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grade);
    }
}

