package pers.crazymouse.exercises;

public class Ex9_6 {
    public static void main(String[] args) {
        java.util.Random fool = new java.util.Random(1000);
        int list[] = new int[100000];
        for (int i = 0; i < list.length; i++)
            list[i] = fool.nextInt(1000);
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        bubbleSort(list);
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());
    }

    public static void bubbleSort(int[] x) {
        for (int i = 0; i < x.length; i++)
            for (int j = i + 1; j < x.length; j++)
                if (x[i] > x[j]) {
                    int t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
    }
}

class StopWatch {
    private long startTime, endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (endTime - startTime);
    }
}
