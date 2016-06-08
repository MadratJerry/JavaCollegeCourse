package pers.crazymouse.exercises.myclass;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Rational extends Number implements Comparable {
    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    private static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return (b > 0) ? gcd(b, a % b) : a;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() -
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public int compareTo(Object o) {
        if (this.subtract((Rational) o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract((Rational) o).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return (this.subtract((Rational) (obj))).getNumerator() == 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }
}
