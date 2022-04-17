package com.example.imageviewtextfield;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller1 {

    public Text headingScene1;
    public ImageView imgId;
    public Button btn;

    public Button submit;
    public TextField age;
    public Label message;

    public void changePicture() {
        imgId.setPreserveRatio(false);
        imgId.setFitWidth(220);
        imgId.setFitHeight(400);
        imgId.setImage(new Image(String.valueOf(getClass().getResource("images/img_2.png"))));

    }

    public void submit() {
        try {
            int t = Integer.parseInt(age.getText());
            System.out.println(t);
            if (t >= 18) {
                message.setText("Sign-in successful!");
            } else {
                message.setText("Age must be 18+");
            }
        } catch (NumberFormatException exception) {
            message.setText("Enter a valid number!");
        } catch (Exception e) {
            message.setText("IDK");
        }
    }

}
