package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Random;

public class Ex14_21 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        primaryStage.setScene(new Scene(pane, 200, 200));

        Random feed = new Random();
        Circle c1 = new Circle();
        c1.setRadius(15);
        c1.setCenterX(feed.nextDouble() * (pane.getWidth() - c1.getRadius()));
        c1.setCenterY(feed.nextDouble() * (pane.getHeight() - c1.getRadius()));

        Circle c2 = new Circle();
        c2.setRadius(15);
        c2.setCenterX(feed.nextDouble() * (pane.getWidth() - c2.getRadius()));
        c2.setCenterY(feed.nextDouble() * (pane.getHeight() - c2.getRadius()));

        Line line = new Line();
        line.setStartX(c1.getCenterX());
        line.setStartY(c1.getCenterY());
        line.setEndX(c2.getCenterX());
        line.setEndY(c2.getCenterY());
        pane.getChildren().addAll(c1, c2, line);

        primaryStage.setTitle("Ex14_21");
        primaryStage.show();
    }
}
