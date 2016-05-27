package pers.crazymouse.exercises.myclass;

public class MyInteger {
    private int value;

    public MyInteger() {
        this(0);
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (value == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= value; i++)
                if (value % i == 0)
                    return false;
            return true;
        }
    }

    public boolean equals(int x) {
        return value == x;
    }

    public boolean equals(MyInteger x) {
        return equals(x.value);
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(MyInteger x) {
        return x.isEven();
    }

    public static boolean isOdd(MyInteger x) {
        return x.isOdd();
    }

    public static boolean isPrime(MyInteger x) {
        return x.isPrime();
    }

    public static boolean isPrime(int x) {
        return new MyInteger(x).isPrime();
    }

    public static int parseInt(char[] x) {
        return parseInt(new String(x));
    }

    public static int parseInt(String x) {
        return Integer.parseInt(x);
    }
}