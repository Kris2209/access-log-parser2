package ru.courses.other;

public class Sauce {
    public String name;
    public Spicyble sharpness;

    public Sauce(String name, Spicyble sharpness) {
        this.name = name;
        this.sharpness = sharpness;
    }

    public String next() {
        return sharpness.toString();
    }
    @Override
    public String toString() {
        return "Соус " + name + ": " +
                sharpness;
    }
}

   interface Spicyble {
}

enum ESharpness implements Spicyble {
    VERYSPICY, SPICY, NOTSPICY
}


