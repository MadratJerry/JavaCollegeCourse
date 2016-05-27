package pers.crazymouse.exercises;

public class Ex10_10 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 20; i++)
            q.enqueue(i);
        System.out.println(q);
    }
}

class Queue {
    private int[] element;
    private int size;

    Queue() {
        this(8);
    }

    Queue(int size) {
        element = new int[size];
    }

    private void toDouble() {
        element = (int[]) resizeArray(element, size * 2);
    }

    private boolean isFull() {
        return size == element.length;
    }

    public void enqueue(int v) {
        if (isFull()) {
            toDouble();
        }
        element[++size - 1] = v;
    }

    public int dequeue() {
        return element[size--];
    }

    public boolean empty() {
        return size == 0;
    }

    public int[] getElement() {
        return element;
    }

    public int getSize() {
        return size;
    }

    private static Object resizeArray(Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class<?> elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int preserveLength = Math.min(oldSize, newSize);
        if (preserveLength > 0)
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        return newArray;
    }

    public String toString() {
        return java.util.Arrays.toString((int[]) resizeArray(element, size));
    }
}