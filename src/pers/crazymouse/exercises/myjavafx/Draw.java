package pers.crazymouse.exercises.myjavafx;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Draw {
    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Line mainLine = new Line(startX, startY, endX, endY);

        double k = (endY - startY) / (endX - startX);
        double px = endX - 10 * cos(k) * ((endX - startX) >= 0 ? 1 : -1);
        double py = endY - 10 * sin(k) * ((endY - startY) >= 0 ? 1 : -1);

        Line subLine1 = new Line();
        subLine1.setStartX(endX);
        subLine1.setStartY(endY);
        subLine1.setEndX(px + 5 * sin(k) * ((endX - startX) >= 0 ? 1 : -1));
        subLine1.setEndY(py - 5 * cos(k) * ((endY - startY) >= 0 ? 1 : -1));

        Line subLine2 = new Line();
        subLine2.setStartX(endX);
        subLine2.setStartY(endY);
        subLine2.setEndX(px - 5 * sin(k) * ((endX - startX) >= 0 ? 1 : -1));
        subLine2.setEndY(py + 5 * cos(k) * ((endY - startY) >= 0 ? 1 : -1));
        pane.getChildren().addAll(mainLine, subLine1, subLine2);
    }

    public static void drawBeanMachine(int n, Pane pane) {
        double level = n;
        final double beanInterval = 20;
        final double beanXInterval = beanInterval;
        final double beanYInterval = beanInterval * Math.sqrt(3) / 2;
        final double beanRadius = 3;
        final double machineDepth = 50;
        final Color beanColor = Color.RED;

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(((level + 1) / 2 - 0.5) * beanXInterval, 0.0);
        polyline.getPoints().addAll(((level + 1) / 2 - 0.5) * beanXInterval, beanYInterval);
        polyline.getPoints().addAll(0.0, level * beanYInterval);
        polyline.getPoints().addAll(0.0, level * beanYInterval + machineDepth);
        polyline.getPoints().addAll((level + 1) * beanXInterval, level * beanYInterval + machineDepth);
        polyline.getPoints().addAll((level + 1) * beanXInterval, level * beanYInterval);
        polyline.getPoints().addAll(((level + 1) / 2 + 0.5) * beanXInterval, beanYInterval);
        polyline.getPoints().addAll(((level + 1) / 2 + 0.5) * beanXInterval, 0.0);

        for (double i = 1, startX = ((level + 1) / 2) * beanXInterval, startY = beanYInterval * 1.5;
             i <= level; i++, startX -= beanXInterval * 0.5, startY += beanYInterval) {
            if (i == level) {
                for (int j = 0; j < i; j++) {
                    Line line = new Line(startX + j * beanXInterval, startY,
                            startX + j * beanXInterval, level * beanYInterval + machineDepth);
                    pane.getChildren().add(line);
                }
            }

            for (int j = 0; j < i; j++) {
                Circle circle = new Circle(startX + j * beanXInterval, startY, beanRadius);
                circle.setFill(beanColor);
                pane.getChildren().add(circle);
            }

        }
        pane.getChildren().addAll(polyline);
    }

    private static double cos(double k) {
        return 1 / Math.sqrt(1 + k * k);
    }

    private static double sin(double k) {
        return Math.sqrt(1 - cos(k) * cos(k));
    }
}
