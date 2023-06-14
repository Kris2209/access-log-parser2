package ru.сourses.students;

import java.util.ArrayList;
import java.util.List;

public final class StudentTest extends RuleChet implements Rule {
    private List grades = new ArrayList<>();
    String name;
    private Rule rule;
    public StudentTest(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }
    public void addGrade(int grade) {
        if (check(grade)) {
            grades.add(grade);
        }
    }
    public String toString() {
        return "ru.сourses.students.Student{" + " grades =" + grades + ", name=" + name + '}';
    }
}
