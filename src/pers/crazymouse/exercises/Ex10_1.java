package pers.crazymouse.exercises;

public class Ex10_1 {
    public static void main(String[] args) {
        Time t = new Time(555550000);
        System.out.println(t.toString());
    }
}

class Time {
    private long hour, minute, second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long milliSecond) {
        long totalSeconds = milliSecond / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 60;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public String toString() {
        return String.format("Hour: %d Minute: %d Second: %d", hour, minute, second);
    }
}