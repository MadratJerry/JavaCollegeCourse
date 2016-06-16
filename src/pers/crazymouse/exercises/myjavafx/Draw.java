package pers.crazymouse.exercises.myjavafx;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

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

    private static double cos(double k) {
        return 1 / Math.pow(1 + k * k, 0.5);
    }

    private static double sin(double k) {
        return Math.pow(1 - cos(k) * cos(k), 0.5);
    }
}
