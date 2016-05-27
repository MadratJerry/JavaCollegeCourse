package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.MyInteger;

import java.util.Stack;


public class Ex10_6 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i <= 120; i++)
            if (MyInteger.isPrime(i))
                stack.add(i);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

class StackOfIntegers {
    private Stack<Integer> stack = new Stack<>();

    StackOfIntegers() {
    }

    void add(int x) {
        stack.add(x);
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    int pop() {
        return stack.pop();
    }

    int size() {
        return stack.size();
    }
}