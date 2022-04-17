package com.example.controllerslogoutexitbuttons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1Application.fxml")));
        Scene scene = new Scene(root);
        String css = Objects.requireNonNull(getClass().getResource("styleSheets/styleSheet1.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        stage.setTitle("Controllers and Logout/Exit");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });//will work for alt+f4 too!
        stage.show();
    }

    public void logout(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before logging out?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out!");
            stage.close();
        }//BOOM ezpz!
        //But this will still close the window if cancel is pressed so in order to overcome that we consume event
    }
}
