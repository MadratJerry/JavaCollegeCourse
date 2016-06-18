package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle(50, 50, 30);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });
        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.WHITE);
        });

        pane.getChildren().add(circle);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex15_7");
        primaryStage.show();
    }
}
