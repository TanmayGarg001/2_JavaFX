package com.example.switchingscenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    private Stage stage;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        String css = Objects.requireNonNull(getClass().getResource("styles/style1.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view2.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        String css = Objects.requireNonNull(getClass().getResource("styles/style1.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();

    }

}