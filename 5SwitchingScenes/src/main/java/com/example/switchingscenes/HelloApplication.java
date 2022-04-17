package com.example.switchingscenes;

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
        Scene scene = new Scene(root);
        String css = Objects.requireNonNull(getClass().getResource("styles/style1.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        stage.setTitle("Switching between scenes!");
        stage.setScene(scene);
        stage.show();
    }
}