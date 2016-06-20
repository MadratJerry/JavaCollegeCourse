package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex15_16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Line line = new Line();
    Text text = new Text();
    Circle circle1 = new Circle(10);
    Circle circle2 = new Circle(10);

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        line.startXProperty().bind(circle1.centerXProperty());
        line.startYProperty().bind(circle1.centerYProperty());
        line.endXProperty().bind(circle2.centerXProperty());
        line.endYProperty().bind(circle2.centerYProperty());
        observer o1 = new observer();
        circle1.centerXProperty().addListener(o1);
        circle1.centerYProperty().addListener(o1);
        circle2.centerXProperty().addListener(o1);
        circle2.centerYProperty().addListener(o1);
        circle1.setCenterX(40);
        circle1.setCenterY(40);
        circle2.setCenterX(120);
        circle2.setCenterY(120);

        circle1.setOnMouseDragged(event -> {
            circle1.setCenterX(event.getX());
            circle1.setCenterY(event.getY());
        });
        circle2.setOnMouseDragged(event -> {
            circle2.setCenterX(event.getX());
            circle2.setCenterY(event.getY());
        });

        pane.getChildren().addAll(line, circle1, circle2, text);
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("Ex15_16");
        primaryStage.show();
    }

    class observer implements InvalidationListener {
        @Override
        public void invalidated(Observable observable) {
            text.setX((circle1.getCenterX() + circle2.getCenterX()) / 2);
            text.setY((circle1.getCenterY() + circle2.getCenterY()) / 2);
            text.setText(
                    String.format("%.2f",
                            Math.sqrt(text.getX() * text.getX() + text.getY() * text.getY())
                    ));
        }
    }
}
