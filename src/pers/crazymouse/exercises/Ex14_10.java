package pers.crazymouse.exercises;/**
 * Created by crazymouse on 6/15/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_10 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Arc arc1 = new Arc(0, 0, 50, 30, 0, 180);
        arc1.layoutXProperty().bind(pane.widthProperty().divide(2));
        arc1.layoutYProperty().bind(pane.heightProperty().divide(3));
        arc1.setFill(null);
        arc1.setStroke(Color.BLACK);
        Arc arc2 = new Arc(0, 0, 50, 30, 0, -180);
        arc2.setFill(null);
        arc2.setStroke(Color.BLACK);
        arc2.layoutXProperty().bind(pane.widthProperty().divide(2));
        arc2.layoutYProperty().bind(pane.heightProperty().divide(3));
        Line line1 = new Line();
        line1.startXProperty().bind(pane.widthProperty().divide(2).add(-50));
        line1.startYProperty().bind(pane.heightProperty().divide(3));
        line1.endXProperty().bind(pane.widthProperty().divide(2).add(-50));
        line1.endYProperty().bind(pane.heightProperty().divide(3).add(100));
        Line line2 = new Line();
        line2.startXProperty().bind(pane.widthProperty().divide(2).add(50));
        line2.startYProperty().bind(pane.heightProperty().divide(3));
        line2.endXProperty().bind(pane.widthProperty().divide(2).add(50));
        line2.endYProperty().bind(pane.heightProperty().divide(3).add(100));
        Arc arc3 = new Arc(0, 0, 50, 30, 0, 180);
        arc3.setFill(null);
        arc3.setStroke(Color.BLACK);
        arc3.layoutXProperty().bind(pane.widthProperty().divide(2));
        arc3.layoutYProperty().bind(pane.heightProperty().divide(3).add(100));
        Arc arc4 = new Arc(0, 0, 50, 30, 0, -180);
        arc4.setFill(null);
        arc4.setStroke(Color.BLACK);
        arc4.layoutXProperty().bind(pane.widthProperty().divide(2));
        arc4.layoutYProperty().bind(pane.heightProperty().divide(3).add(100));
        arc3.getStrokeDashArray().addAll(6.0, 21.0);
        pane.getChildren().addAll(arc1, arc2, arc3, arc4, line1, line2);

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Ex14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
