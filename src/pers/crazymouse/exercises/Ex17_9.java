package pers.crazymouse.exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by crazymouse on 6/20/16.
 */
public class Ex17_9 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        VBox pane = new VBox(10);
        pane.setPrefWidth(400);
        pane.setPadding(new Insets(10, 10, 10, 10));
        HBox[] infPane = new HBox[4];
        for (int i = 0; i < 4; i++) {
            infPane[i] = new HBox(10);
            infPane[i].setAlignment(Pos.CENTER);
        }

        Text tName = new Text("Name");
        TextField tfName = new TextField();
        tfName.prefWidthProperty().bind(pane.widthProperty());
        infPane[0].getChildren().addAll(tName, tfName);

        Text tStreet = new Text("Street");
        TextField tfStreet = new TextField();
        tfStreet.prefWidthProperty().bind(pane.widthProperty());
        infPane[1].getChildren().addAll(tStreet, tfStreet);

        Text tCity = new Text("City");
        TextField tfCity = new TextField();
        Text tState = new Text("State");
        TextField tfState = new TextField();
        Text tZip = new Text("Zip");
        TextField tfZip = new TextField();
        infPane[2].getChildren().addAll(tCity, tfCity, tState, tfState, tZip, tfZip);

        Button btAdd = new Button("Add");
        Button btFirst = new Button("First");
        Button btNext = new Button("Next");
        Button btPrevious = new Button("Previous");
        Button btLast = new Button("Last");
        Button btUpdate = new Button("Update");
        infPane[3].getChildren().addAll(btAdd, btFirst, btNext, btPrevious, btLast, btUpdate);
        pane.getChildren().addAll(infPane);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ex17_9");
        primaryStage.show();

        Controller controller = new Controller();
        controller.tf.add(tfName);
        controller.tf.add(tfStreet);
        controller.tf.add(tfCity);
        controller.tf.add(tfState);
        controller.tf.add(tfZip);
        controller.init();

        btAdd.setOnMouseClicked(event -> controller.add());
        btFirst.setOnMouseClicked(event -> controller.first());
        btLast.setOnMouseClicked(event -> controller.last());
        btNext.setOnMouseClicked(event -> controller.next());
        btPrevious.setOnMouseClicked(event -> controller.previous());
        btUpdate.setOnMouseClicked(event -> controller.update());
    }
}

class Controller {
    RandomAccessFile file;
    ArrayList<Address> addresses = new ArrayList<>();
    public ArrayList<TextField> tf = new ArrayList<>();
    int num = 0;

    Controller() throws IOException {
        file = new RandomAccessFile("file/Exercise17_09.dat", "rw");
    }

    void init() throws IOException {
        try {
            while (true) {
                Address address = new Address();
                for (FixedString i : address.string)
                    readString(i);
                addresses.add(address);
            }
        } catch (EOFException ex) {
            if (addresses.size() > 0) fill();
            else System.out.println("Empty.");
        }
    }

    void fill() {
        for (Address i : addresses) {
            for (FixedString j : i.string) {
                System.out.print(j.toString().trim() + " ");
            }
            System.out.println();
        }
        Address address = addresses.get(num);
        for (int i = 0; i < address.string.length; i++)
            tf.get(i).setText(address.string[i].toString().trim());
    }

    void close() throws IOException {
        file.close();
    }

    void readString(FixedString string) throws IOException {
        string.clear();
        for (int i = 0; i < string.getLength(); i++) {
            string.append(file.readChar());
        }
    }

    void next() {
        if (num + 1 < addresses.size()) num++;
        fill();
    }

    void previous() {
        if (num - 1 >= 0) num--;
        fill();
    }

    void first() {
        num = 0;
        fill();
    }

    void last() {
        num = addresses.size() - 1;
        fill();
    }

    void add() {
        System.out.println("Addresses size: " + addresses.size());
        Address address = new Address();
        for (int i = 0; i < tf.size(); i++) {
            address.string[i].setString(tf.get(i).getText());
        }
        addresses.add(num, address);
    }

    void update() {
        if (addresses.size() == 0) {
            add();
            return;
        }

        Address address = new Address();
        for (int i = 0; i < tf.size(); i++) {
            address.string[i].setString(tf.get(i).getText());
        }
        addresses.set(num, address);
        try {
            file.setLength(0);
            file.seek(0);
            for (Address i : addresses)
                for (FixedString j : i.string)
                    file.writeChars(j.toString());
        } catch (IOException ex) {
            System.out.println("IOException.");
        }
    }
}

class FixedString {
    StringBuilder sb = new StringBuilder();
    int length;

    FixedString(String string, int length) {
        sb.append(string);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    FixedString(int length) {
        setLength(length);
    }

    public void setString(String string) {
        sb.setLength(0);
        sb.append(string);
    }

    public void append(char x) {
        sb.append(x);
    }

    public void clear() {
        setString("");
    }

    @Override
    public String toString() {
        StringBuilder tostring = new StringBuilder();
        tostring.append(sb.toString());
        tostring.setLength(getLength());
        return tostring.toString();
    }
}

class Address {
    FixedString[] string = new FixedString[5];
    FixedString name = string[0];
    FixedString street = string[1];
    FixedString city = string[2];
    FixedString state = string[3];
    FixedString zip = string[4];

    Address() {
        string[0] = new FixedString(32);
        string[1] = new FixedString(32);
        string[2] = new FixedString(20);
        string[3] = new FixedString(2);
        string[4] = new FixedString(5);
    }
}
