package com.example.checkboxradiobuttons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        String css = Objects.requireNonNull(getClass().getResource("styleSheets/styleSheet1.css")).toExternalForm();
        root.getStylesheets().add(css);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/icon.png"))));
        stage.setTitle("Buttons");
        stage.setScene(new Scene(root));
        stage.show();
    }
}