package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        pane.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(5);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                circle.setCenterX(event.getX());
                circle.setCenterY(event.getY());

                circle.setOnMouseClicked(event1 -> {
                    if (event1.getButton() == MouseButton.SECONDARY)
                        pane.getChildren().remove(circle);
                });
                pane.getChildren().add(circle);
            }
        });

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("Ex15_15");
        primaryStage.show();
    }
}
