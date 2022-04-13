package com.example.eventhandling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        stage.setTitle("Event Handling!");
        stage.setScene(new Scene(root));
        stage.show();
        //here we made all the body of the layout, now we will implement the functionality in HelloController class.
    }
}