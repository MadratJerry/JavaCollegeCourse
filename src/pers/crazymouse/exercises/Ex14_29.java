package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/17/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.Draw;

public class Ex14_29 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Draw.drawBeanMachine(40, pane);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_29");
        primaryStage.show();
    }
}
