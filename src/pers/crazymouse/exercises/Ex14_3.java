package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/15/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class Ex14_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new HBox();
        Random feed = new Random();
        for (int i = 0; i < 3; i++) {
            String str = feed.nextInt(51) + 1 + "";
            pane.getChildren().add(new ImageView(new Image(
                    new FileInputStream("image/card/" + str + ".png"))));
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex14_3");
        primaryStage.show();
    }
}
