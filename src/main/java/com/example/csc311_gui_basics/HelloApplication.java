package com.example.csc311_gui_basics;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //fxmlloader is like a group
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        //below is reading from the fxmlLoader and
        Scene scene = new Scene(fxmlLoader.load(), 300, 240, Color.OLIVEDRAB);
        /**
         * since we're using the fxml loader to set the scene,
         * how can we access nodes on the screen to change them?
         * i can rotate my text once, but thats it? how can I get
         * the text to rotate each time I click the button?
         */
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}