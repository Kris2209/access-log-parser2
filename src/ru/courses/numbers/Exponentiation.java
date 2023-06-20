package ru.courses.numbers;

public class Exponentiation {
    int a, b;

    public Exponentiation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Exponentiation stringInInt(String x, String y) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        return new Exponentiation(a, b);
    }

    public static int mathPow(Exponentiation e) {
        return (int) Math.pow(e.a, e.b);

    }
    public static int exponentiation(String s1, String s2){
       Exponentiation e = stringInInt(s1, s2);
        return mathPow(e);
    }

    @Override
    public String toString() {
        return "Exponentiation{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    /*  public static int exponentiation(String x, String y) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int res = (int) Math.pow(a, b);
        return res;
    } */
}
