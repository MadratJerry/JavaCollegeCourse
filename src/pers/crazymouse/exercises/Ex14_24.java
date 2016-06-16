package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Ex14_24 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Polygon polygon = new Polygon();
        ObservableList<Double> list = polygon.getPoints();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            list.add(input.nextDouble());
            list.add(input.nextDouble());
        }

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setCenterX(input.nextDouble());
        circle.setCenterY(input.nextDouble());

        Pane pane = new VBox();
        Pane imagePane = new Pane();
        imagePane.getChildren().addAll(polygon, circle);

        Text text = new Text(polygon.contains(circle.getCenterX(), circle.getCenterY()) ?
                "The point is inside the polygon" : "The point is outside the polygon");
        pane.getChildren().addAll(imagePane, text);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_24");
        primaryStage.show();
    }
}
