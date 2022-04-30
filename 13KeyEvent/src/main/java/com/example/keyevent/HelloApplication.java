package com.example.keyevent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //Easiest way to handle key even is using Event handler and using it in start method only.
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        Parent root = loader.load();
        HelloController controller = loader.getController();//program check for the events in Controller class.
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(keyEvent.getCode());//this print the key pressed to console
                switch (keyEvent.getCode()) {
                    case W, UP -> controller.moveUp();
                    case S, DOWN -> controller.moveDown();
                    case A, LEFT -> controller.moveLeft();
                    case D, RIGHT -> controller.moveRight();
                }
            }
        });

        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("icons/img.png"))));
        root.getStylesheets().add(String.valueOf(getClass().getResource("styleSheets/styleSheet1.css")));
        stage.setScene(scene);
        stage.show();
    }
}