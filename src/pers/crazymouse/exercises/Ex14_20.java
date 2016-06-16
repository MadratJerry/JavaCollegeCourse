package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.Draw;

public class Ex14_20 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Draw.drawArrowLine(100, 250, 200, 10, pane);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("Ex14_18");
        primaryStage.show();
    }
}
