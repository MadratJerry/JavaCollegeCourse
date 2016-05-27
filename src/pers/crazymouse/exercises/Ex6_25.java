package pers.crazymouse.exercises;

public class Ex6_25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(555550000));
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        return String.format("%d:%d:%d", totalHours, minutes, seconds);
    }
}
