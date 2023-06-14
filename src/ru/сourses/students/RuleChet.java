package ru.сourses.students;

public class RuleChet implements Rule {
    @Override
    public boolean check(int x) {
        return ((x % 2) == 0) && (x > 0) && (x <= 100000);
    }
}
