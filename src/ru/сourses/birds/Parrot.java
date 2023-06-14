package ru.сourses.birds;

public class Parrot extends Bird {
    String songText;

    public Parrot(String songText) {
        this.songText = songText;
    }

    public void singing() {
        int textLength = songText.length();
        int a = (int) (1 + Math.random() * textLength);
        for (int i = 0; i <= a; i++) {
            System.out.print(songText.charAt(i));
        }
    }
}
