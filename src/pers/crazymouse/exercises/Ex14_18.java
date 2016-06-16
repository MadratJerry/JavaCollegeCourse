package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.Draw;

public class Ex14_18 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(-scaleFactor * x * x + 200);
        }
        Text textX = new Text(380, 180, "X");
        Text textY = new Text(220, 30, "Y");

        pane.getChildren().addAll(polyline, textX, textY);
        Draw.drawArrowLine(0, 200, 400, 200, pane);
        Draw.drawArrowLine(200, 250, 200, 10, pane);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_18");
        primaryStage.show();
    }
}
