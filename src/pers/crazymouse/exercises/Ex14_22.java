package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Ex14_22 extends Application {

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
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);

        Circle c2 = new Circle();
        c2.setRadius(15);
        c2.setCenterX(feed.nextDouble() * (pane.getWidth() - c2.getRadius()));
        c2.setCenterY(feed.nextDouble() * (pane.getHeight() - c2.getRadius()));
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);

        Line line = new Line();
        line.setStartX(c1.getCenterX());
        line.setStartY(c1.getCenterY());
        line.setEndX(c2.getCenterX());
        line.setEndY(c2.getCenterY());

        Text t1 = new Text(c1.getCenterX(), c1.getCenterY(), "1");
        Text t2 = new Text(c2.getCenterX(), c2.getCenterY(), "2");
        pane.getChildren().addAll(line, c1, c2, t1, t2);

        primaryStage.setTitle("Ex14_22");
        primaryStage.show();
    }
}
