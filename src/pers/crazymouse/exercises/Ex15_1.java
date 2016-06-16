package pers.crazymouse.exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex15_1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane paneImage = new HBox();
        refreshImage(paneImage);

        GridPane paneButton = new GridPane();
        paneButton.setAlignment(Pos.CENTER);
        Button btRefresh = new Button("Refresh");
        btRefresh.setOnMouseClicked(e -> {
            refreshImage(paneImage);
        });
        paneButton.getChildren().add(btRefresh);

        Pane pane = new VBox();
        pane.getChildren().addAll(paneImage, paneButton);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex15_1");
        primaryStage.show();
    }

    public void refreshImage(Pane paneImage) {
        Random feed = new Random();
        paneImage.getChildren().clear();
        try {
            for (int i = 0; i < 4; i++) {
                String str = feed.nextInt(51) + 1 + "";
                paneImage.getChildren().add(new ImageView(new Image(
                        new FileInputStream("image/card/" + str + ".png"))));
            }
        } catch (IOException ex) {
            System.out.print("Can't read the image.");
        }
    }
}
