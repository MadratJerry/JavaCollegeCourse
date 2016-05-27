package pers.crazymouse.exercises;

public class Ex10_22 {
    public static void main(String[] args) {
        MyString1 str = new MyString1(new char[]{'H', 'y', 't'});
        System.out.println(str.charAt(1));
        System.out.println(str.toLowerCase());
        System.out.println(str.equals(new MyString1(new char[]{'h', 'y', 't'})));
        System.out.println(MyString1.valueOf(123));
    }
}

class MyString1 {
    private char chars[];

    public MyString1() {
        this(new char[]{});
    }

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        MyString1 result = new MyString1(new char[end - begin]);
        for (int i = begin; i <= end; i++) {
            result.chars[i - begin] = chars[i];
        }
        return result;
    }

    public MyString1 toLowerCase() {
        MyString1 result = new MyString1(new char[chars.length]);
        for (int i = 0; i < chars.length; i++) {
            result.chars[i] = Character.toLowerCase(chars[i]);
        }
        return result;
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++)
                if (chars[i] != s.charAt(i))
                    return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(String.valueOf(i).toCharArray());
    }

    public String toString() {
        return new String(chars);
    }
}
