package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/15/16.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rec = new Rectangle(50, 50, 50, 50);
                rec.setFill(((i + j) % 2 == 0) ? Color.WHITE : Color.BLACK);
                pane.add(rec, i, j); // Need new node
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex14_6");
        primaryStage.show();
    }
}
