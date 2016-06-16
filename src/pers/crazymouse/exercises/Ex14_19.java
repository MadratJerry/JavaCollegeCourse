package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.Draw;

public class Ex14_19 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Text textX = new Text(380, 120, "X");
        Text textY = new Text(220, 20, "Y");

        double scaleFactor = 50;
        Polyline sin = new Polyline();
        ObservableList<Double> list = sin.getPoints();
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        sin.setStroke(Color.RED);

        Polyline cos = new Polyline();
        list = cos.getPoints();
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }
        cos.setStroke(Color.BLUE);

        for (int i = 0; i <= 4; i++) {
            pane.getChildren().add(new Text((i + 2) * scaleFactor, 120,
                    (i == 1 || i == 3 ? "" : (i - 2) + "") + (i == 2 ? "" : "π")));
        }

        pane.getChildren().addAll(sin, cos, textX, textY);
        Draw.drawArrowLine(0, 100, 400, 100, pane);
        Draw.drawArrowLine(200, 200, 200, 10, pane);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_19");
        primaryStage.show();
    }
}
