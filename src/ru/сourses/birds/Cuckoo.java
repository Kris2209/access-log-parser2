package ru.сourses.birds;

public class Cuckoo extends Bird {
    @Override
    public void singing() {
        int a = (int) (1 + Math.random() * 10);
        int i = 0;
        while (i <= a) {
            System.out.println("ку-ку");
            i++;
        }
    }
}
