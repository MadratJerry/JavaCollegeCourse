package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/18/16.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex15_6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Java is fun");
        stringArrayList.add("Java is powerful");
        Text text = new Text(stringArrayList.get(0));
        text.setOnMouseClicked(event -> {
            text.setText(stringArrayList.get(
                    (stringArrayList.indexOf(text.getText()) + 1) % stringArrayList.size()
            ));
        });
        pane.getChildren().add(text);

        primaryStage.setScene(new Scene(pane, 100, 100));
        primaryStage.setTitle("EX15_6");
        primaryStage.show();
    }
}
