package com.example.imageviewtextfield;

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

    //ImageView is a node used for painting images loaded with images, analogy:- Image=photograph, ImageView = pictureFrame
    //So imageView is loaded with images.
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        String css = Objects.requireNonNull(getClass().getResource("stylesheets/styleSheet1.css")).toExternalForm();
        root.getStylesheets().add(css);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        stage.setTitle("Hi");
        stage.setScene(new Scene(root));
        stage.show();
    }

}