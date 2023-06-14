package ru.сourses.numbers;
public class Fraction extends Number{
     private final int numer, denomin;

    public Fraction(int numer, int denomin) {
        if (denomin <= 0) throw new IllegalArgumentException("denomin must be posirive");
        this.numer = numer;
        this.denomin = denomin;
    }
    @Override
    public Fraction plusFraction(Fraction f){
        Fraction res = new Fraction(this.numer + f.numer, this.denomin * f.denomin);
        return res;
    }
    @Override
    public Fraction plusInt(int x){
       Fraction f = new Fraction(x,1);
       return plusFraction(f);
            }
    @Override
    public Fraction minusFraction(Fraction f){
        Fraction res = new Fraction(this.numer - f.numer, this.denomin * f.denomin);
        return res;

    }
    @Override
    public Fraction minusInt(int x){
        Fraction f = new Fraction(x,1);
        return minusFraction(f);
    }
    @Override
    public String toString() {
        return numer + "/" + denomin;
    }
}
