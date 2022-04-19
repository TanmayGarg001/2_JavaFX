package com.example.datepickercolorpickercoicebox;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private final String[] items = {"Pizza", "Burger", "Roll", "Ice-Cream"};
    //we can't add options using scene builder or using a trigger method, so we have to initialize the options by ourselves using hard coding,
    //so we initialize the controller using Initialize Interface.
    public Label message;
    public Button submit;
    public DatePicker datePick;
    public ColorPicker colorPick;
    public TextField namePick;
    public AnchorPane myPane;
    public ChoiceBox<String> choiceEat;

    public void messageUpdate() {
        LocalDate localDate = datePick.getValue();
        String date = localDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        message.setText("Name: " + namePick.getText() + "\nDate Of Birth: " + date + "\nColor Choice: " + colorPick.getValue() + "\nFood item: " + choiceEat.getValue());
        myPane.setBackground(new Background(new BackgroundFill(colorPick.getValue(), null, null)));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceEat.getItems().addAll(items);
    }
}