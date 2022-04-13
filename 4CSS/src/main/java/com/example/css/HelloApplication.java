package com.example.css;

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
        Scene scene = new Scene(root);//we can directly pass the parent root to setScene like stage.setScene(new Scene(root)), if we are having only one scene.

        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        String css = Objects.requireNonNull(getClass().getResource("styles/styleSheetCSS.css")).toExternalForm();//so we can use a style multiple times.
        scene.getStylesheets().add(css);

        stage.setTitle("CSS Magic");
        stage.setScene(scene);
        stage.show();
    }

}