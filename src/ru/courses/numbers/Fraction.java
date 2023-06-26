package ru.courses.numbers;
public class Fraction extends Number{
     private final int numer, denomin;

    public Fraction(int numer, int denomin) {
        if (denomin <= 0) throw new IllegalArgumentException("denomin must be posirive");
        this.numer = numer;
        this.denomin = denomin;
    }

    public Fraction plusFraction(Fraction f){
        Fraction res = new Fraction((this.numer * f.denomin)+(f.numer * this.denomin), this.denomin * f.denomin);
        return res;
    }

    public Fraction plusInt(int x){
       Fraction f = new Fraction(x,1);
       return plusFraction(f);
            }

    public Fraction minusFraction(Fraction f){
        Fraction res = new Fraction((this.numer * f.denomin)-(f.numer * this.denomin), this.denomin * f.denomin);
        return res;

    }

    public Fraction minusInt(int x){
        Fraction f = new Fraction(x,1);
        return minusFraction(f);
    }
    @Override
    public String toString() {
        return numer + "/" + denomin;
    }

    @Override
    public int intValue() {
        return numer/denomin;
    }

    @Override
    public long longValue() {
        return (long) numer/denomin;
    }

    @Override
    public float floatValue() {
        return (float) numer/denomin;
    }

    @Override
    public double doubleValue() {
        return (double) numer/denomin;
    }


    public double fractionDivision(){
        return (double) this.numer/this.denomin;
    }
}

