package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/15/16.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField text = new TextField();
                text.setText(Math.random() < 0.5 ? "0" : "1");
                text.setPrefColumnCount(1);
                pane.add(text, i, j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex14_6");
        primaryStage.show();
    }
}
