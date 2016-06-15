package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/16/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Rectangle r1 = new Rectangle(0, 80, 60, 20);
        r1.setFill(Color.RED);
        pane.getChildren().addAll(new Text(0, 70, "项目--20%"), r1);

        Rectangle r2 = new Rectangle(60, 90, 60, 10);
        r2.setFill(Color.BLUE);
        pane.getChildren().addAll(new Text(60, 80, "测试--10%"), r2);

        Rectangle r3 = new Rectangle(120, 70, 60, 30);
        r3.setFill(Color.GREEN);
        pane.getChildren().addAll(new Text(120, 60, "期中--30%"), r3);

        Rectangle r4 = new Rectangle(180, 40, 60, 60);
        r4.setFill(Color.ORANGE);
        pane.getChildren().addAll(new Text(180, 30, "期末--40%"), r4);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex14_12");
        primaryStage.show();
    }
}
