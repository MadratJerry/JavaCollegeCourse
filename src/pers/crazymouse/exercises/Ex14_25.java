package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Arrays;

public class Ex14_25 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        double radious = 80;
        Circle circle = new Circle(100, 100, radious);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        double[] degree = new double[5];
        for (int i = 0; i < 5; i++) {
            degree[i] = Math.random() * 2 * Math.PI;
        }
        Arrays.sort(degree);

        Polygon polygon = new Polygon();
        ObservableList<Double> list = polygon.getPoints();
        for (double i : degree) {
            list.add(100 + radious * Math.cos(i));
            list.add(100 + radious * Math.sin(i));
        }
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);


        pane.getChildren().addAll(circle, polygon);
        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("Ex14_25");
        primaryStage.show();
    }
}
