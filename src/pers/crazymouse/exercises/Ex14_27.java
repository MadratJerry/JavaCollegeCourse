package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/17/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.ClockPane;

public class Ex14_27 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane pane = new ClockPane();
        pane.setDetail(true);
        pane.setDigital(true);

        primaryStage.setTitle("Ex14_27");
        primaryStage.setScene(new Scene(pane, pane.getW(), pane.getH()));
        primaryStage.show();
    }
}
