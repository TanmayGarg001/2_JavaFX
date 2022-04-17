package com.example.controllerslogoutexitbuttons;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Scene1Controller {
    public Button loginID;
    public TextField nameID;
    public AnchorPane apane1;
    public Button logout;
    Scene scene;
    Stage stage;

    public void login(ActionEvent event) throws IOException {
        String username = nameID.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2Application.fxml"));
        String css = Objects.requireNonNull(getClass().getResource("styleSheets/styleSheet2.css")).toExternalForm();
        Parent root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.setWelcomeID(username);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before logging out?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) apane1.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
        //copy the same function again
        //this will pop up logout menu but in order to do the same thing if we click on X, we pass in stage as parameter ans trigger setOnCloseRequest in main function.
    }
}
