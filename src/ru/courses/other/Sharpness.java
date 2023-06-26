package ru.courses.other;

public class Sharpness implements Spicyble {
    private String txt;
    public static final Sharpness VERYSPICY = new Sharpness("Very spicy");
    public static final Sharpness SPICY = new Sharpness("Spicy");
    public static final Sharpness NOTSPICY = new Sharpness("Not spicy");

    private Sharpness(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }
}
