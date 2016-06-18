package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        primaryStage.setScene(new Scene(pane, 200, 200));

        Circle ball = new Circle(100, 100, 30);
        ball.setFill(Color.WHITE);
        ball.setStroke(Color.BLACK);

        ball.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W:
                case UP:
                    if (ball.getCenterY() >= 10) ball.setCenterY(ball.getCenterY() - 10);
                    break;
                case S:
                case DOWN:
                    if (ball.getCenterY() <= pane.getHeight() - 10) ball.setCenterY(ball.getCenterY() + 10);
                    break;
                case A:
                case LEFT:
                    if (ball.getCenterX() >= 10) ball.setCenterX(ball.getCenterX() - 10);
                    break;
                case D:
                case RIGHT:
                    if (ball.getCenterX() <= pane.getWidth() - 10) ball.setCenterX(ball.getCenterX() + 10);
            }
        });

        pane.getChildren().add(ball);

        primaryStage.setTitle("Ex15_3");
        primaryStage.show();

        ball.requestFocus();
    }
}
