package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex15_8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Text text = new Text();
        pane.getChildren().add(text);

        pane.setOnMousePressed(event -> {
            text.setX(event.getX());
            text.setY(event.getY());
            text.setText(String.format("(%.2f, %.2f)", event.getX(), event.getY()));
        });
        pane.setOnMouseReleased(event -> {
            text.setText("");
        });

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("Ex15_8");
        primaryStage.show();
    }
}
