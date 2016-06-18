package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Ex15_9 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(100.0, 100.0);
        polyline.setStroke(Color.BLACK);
        ObservableList<Double> list = polyline.getPoints();
        pane.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W:
                case UP:
                    list.addAll(
                            list.get(list.size() - 2),
                            list.get(list.size() - 1) - 10
                    );
                    break;
                case S:
                case DOWN:
                    list.addAll(
                            list.get(list.size() - 2),
                            list.get(list.size() - 1) + 10
                    );
                    break;
                case A:
                case LEFT:
                    list.addAll(
                            list.get(list.size() - 2) - 10,
                            list.get(list.size() - 1)
                    );
                    break;
                case D:
                case RIGHT:
                    list.addAll(
                            list.get(list.size() - 2) + 10,
                            list.get(list.size() - 1)
                    );
                    break;
            }
        });
        pane.getChildren().add(polyline);

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("Ex15_9");
        primaryStage.show();

        pane.requestFocus();
    }
}
