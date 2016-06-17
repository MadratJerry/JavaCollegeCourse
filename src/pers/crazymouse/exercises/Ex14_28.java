package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/17/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myjavafx.ClockPane;

public class Ex14_28 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane pane = new ClockPane((int) (Math.random() * 12),
                (int) (Math.random() * 60), (int) (Math.random() * 60));
        pane.setSecondHandVisible(false);

        primaryStage.setTitle("Ex14_28");
        primaryStage.setScene(new Scene(pane, pane.getW(), pane.getH()));
        primaryStage.show();
    }
}
