package com.example.animations;

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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        String css = Objects.requireNonNull(getClass().getResource("styleSheets/styleSheet1.css")).toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Animations");
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("icons/img.png"))));
        stage.setScene(new Scene(root));
        stage.show();
    }

}