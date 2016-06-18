package pers.crazymouse.exercises.myjavafx;

import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by crazymouse on 6/17/16.
 */
public class ClockPane extends VBox {
    private int hour;
    private int minute;
    private int second;

    private boolean detail = false;
    private boolean digital = false;

    private boolean hourHandVisible = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;

    // Clock pane's width and height
    private double w = 300, h = 300;

    public ClockPane() {
        setCurrentTime();
        paintClock();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getH() {
        return h;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setDetail(boolean detail) {
        this.detail = detail;
        paintClock();
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
        paintClock();
    }

    public boolean isHourHandVisible() {
        return hourHandVisible;
    }

    public void setHourHandVisible(boolean hourHandVisible) {
        this.hourHandVisible = hourHandVisible;
        paintClock();
    }

    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }

    public void setMinuteHandVisible(boolean minuteHandVisible) {
        this.minuteHandVisible = minuteHandVisible;
        paintClock();
    }

    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }

    public void setSecondHandVisible(boolean secondHandVisible) {
        this.secondHandVisible = secondHandVisible;
        paintClock();
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();
    }

    protected void paintClock() {
        Pane pane = new Pane();
        // Initialize clock parameters
        double clockRadius = Math.min(w, h) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;

        // Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

        // Draw second hand
        double sLength = clockRadius * 0.8;
        double secondX = handX(centerX, sLength, second, 60);
        double secondY = handY(centerY, sLength, second, 60);
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        // Draw minute hand
        double mLength = clockRadius * 0.65;
        double minuteX = handX(centerX, mLength, minute, 60);
        double minuteY = handY(centerY, mLength, minute, 60);
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        mLine.setStroke(Color.BLUE);

        // Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = handX(centerX, hLength, hour % 12 + minute / 60.0, 12);
        double hourY = handY(centerY, hLength, hour % 12 + minute / 60.0, 12);
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        setAlignment(Pos.CENTER);
        pane.getChildren().clear();
        pane.getChildren().addAll(circle, t1, t2, t3, t4);
        if (hourHandVisible) pane.getChildren().add(hLine);
        if (minuteHandVisible) pane.getChildren().add(mLine);
        if (secondHandVisible) pane.getChildren().add(sLine);

        if (detail) {
            double detailLength = 4;
            pane.getChildren().removeAll(t1, t2, t3, t4);
            for (double i = 0 - Math.PI / 2, count = 0; i <= Math.PI * 1.5; i += Math.PI * 2 / 60, count++) {
                Line line = new Line();
                line.setStartX(centerX + clockRadius * Math.cos(i));
                line.setStartY(centerY + clockRadius * Math.sin(i));
                line.setEndX(centerX + (clockRadius - ((count % 5 == 0) ? 2 : 1) * detailLength) * Math.cos(i));
                line.setEndY(centerY + (clockRadius - ((count % 5 == 0) ? 2 : 1) * detailLength) * Math.sin(i));
                if (count % 5 == 0 && count != 0) {
                    double key = 5;
                    Text text = new Text((centerX + (clockRadius - key * detailLength) * Math.cos(i)) - (key / 2 - 0.5) * detailLength,
                            centerY + (clockRadius - key * detailLength) * Math.sin(i) + (key / 2 - 1) * detailLength,
                            String.format("% .0f", count / 5));
                    pane.getChildren().add(text);
                }
                pane.getChildren().add(line);
            }
        }

        getChildren().add(pane);
        if (digital) {
            Text digital = new Text(String.format("%02d:%02d:%02d", hour, minute, second));
            getChildren().add(digital);
        }
    }

    private double handX(double centerX, double length, double num, double p) {
        return centerX + length * Math.sin(num * (2 * Math.PI / p));
    }

    private double handY(double centerY, double length, double num, double p) {
        return centerY - length * Math.cos(num * (2 * Math.PI / p));
    }
}