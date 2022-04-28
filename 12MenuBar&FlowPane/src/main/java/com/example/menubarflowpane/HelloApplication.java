package com.example.menubarflowpane;
//Flow pane is just a type of pane, previously we used AnchorPane but now in Flow pane in kind of flows together on re-sizing.

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
        stage.setTitle("MenuBar & FlowPane");
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("icons/appIcon.png"))));
        root.getStylesheets().add(String.valueOf(getClass().getResource("styleSheets/styleSheet1.css")));
        stage.setScene(new Scene(root));
        stage.show();
    }
}