package com.example.checkboxradiobuttons;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    public ImageView offBulb;
    public Label labelStat;
    public CheckBox bulbStatus;

    public Label selectedItem;
    public RadioButton pizza;
    public RadioButton burger;
    public RadioButton roll;
    public RadioButton sushi;
    public RadioButton sub;
    public ToggleGroup snackType;

    public void triggerBulb() {
        if (!bulbStatus.isSelected()) {
            offBulb.setImage(new Image(String.valueOf(getClass().getResource("images/bulbOFF.png"))));
            labelStat.setText("Bulb is OFF :0");
        } else {
            offBulb.setImage(new Image(String.valueOf(getClass().getResource("images/bulbON.png"))));
            labelStat.setText("Bulb is ON :D");
        }
    }

    public void triggerSnack() {
        if (pizza.isSelected()) {
            selectedItem.setText("Selected Item : Pizza");
        } else if (burger.isSelected()) {
            selectedItem.setText("Selected Item : Burger");
        } else if (roll.isSelected()) {
            selectedItem.setText("Selected Item : Roll");
        } else if (sushi.isSelected()) {
            selectedItem.setText("Selected Item : Sushi");
        } else if (sub.isSelected()) {
            selectedItem.setText("Selected Item : Sub");
        } else {
            selectedItem.setText("Selected Item : None");
        }
    }

}