package com.example.mediaview;

//NOTE :- BE SURE TO CHANGE PROJECT STRUCTURE LIBRARIES TO JAVA FX17 INSTEAD OF USING JAVAFX WHICH IS BUNDLED WIH JAVA(REMOVE THE ONE THAT COMES WITH JAVA TO RESOLVE CONFLICTS)
//ELSE THE MEDIA CLASS WILL NOT WORK

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
        String css = getClass().getResource("styleSheets/styleSheet1.css").toExternalForm();
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("icons/mediaPlayer.png"))));
        stage.setTitle("Media Player");
        root.getStylesheets().add(css);
        stage.setScene(new Scene(root));
        stage.show();
    }

}