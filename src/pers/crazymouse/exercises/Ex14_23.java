package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pers.crazymouse.exercises.myclass.Rectangle;

public class Ex14_23 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.input();
        r2.input();

        String ubiety = "";
        switch (r2.getUbiety(r1)) {
            case 0:
                ubiety = "One rectangle is contained in another";
                break;
            case 1:
                ubiety = "The rectangles overlap";
                break;
            case -1:
                ubiety = "The rectangles do note overlap";
        }
        if (r1.getUbiety(r2) == 0)
            ubiety = "One rectangle is contained in another";

        Pane pane = new VBox();
        Pane imagePane = new Pane();
        Text text = new Text(ubiety);

        javafx.scene.shape.Rectangle rec1 = new javafx.scene.shape.Rectangle(
                r1.getX(), r1.getY(), r1.getWidth(), r1.getHeight());
        javafx.scene.shape.Rectangle rec2 = new javafx.scene.shape.Rectangle(
                r2.getX(), r2.getY(), r2.getWidth(), r2.getHeight());
        imagePane.getChildren().addAll(rec1, rec2);

        pane.getChildren().addAll(imagePane, text);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_23");
        primaryStage.show();
    }
}
