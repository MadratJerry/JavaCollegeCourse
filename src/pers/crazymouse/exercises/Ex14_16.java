package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        primaryStage.setScene(new Scene(pane, 400, 200));
        for (int i = 1; i <= 2; i++) {
            Line rawLine = new Line();
            rawLine.setStartX(0);
            rawLine.endXProperty().bind(pane.widthProperty());
            rawLine.startYProperty().bind(pane.heightProperty().divide(3).multiply(i));
            rawLine.endYProperty().bind(pane.heightProperty().divide(3).multiply(i));
            rawLine.setStroke(Color.BLUE);
            pane.getChildren().add(rawLine);
        }

        for (int i = 1; i <= 2; i++) {
            Line colLine = new Line();
            colLine.setStartY(0);
            colLine.endYProperty().bind(pane.heightProperty());
            colLine.startXProperty().bind(pane.widthProperty().divide(3).multiply(i));
            colLine.endXProperty().bind(pane.widthProperty().divide(3).multiply(i));
            colLine.setStroke(Color.RED);
            pane.getChildren().add(colLine);
        }
        primaryStage.setTitle("Ex14_16");
        primaryStage.show();
    }
}
