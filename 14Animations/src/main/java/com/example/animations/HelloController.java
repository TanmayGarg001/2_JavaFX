package com.example.animations;

import javafx.animation.*;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public ImageView stickMan;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //translate :- used to move
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(stickMan);
        translateTransition.setDuration(Duration.seconds(1));
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.setByX(225);
        translateTransition.setAutoReverse(true);
        translateTransition.play();

        //rotate :- used to rotate
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(stickMan);
        rotateTransition.setDuration(Duration.seconds(1));
        rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        rotateTransition.setByAngle(60);//Z axis rotation happens by default we can change that using setAxis(Rotate.X_AXIS);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();

        //fade :- fades in/out
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(stickMan);
        fadeTransition.setDuration(Duration.seconds(1));
        fadeTransition.setCycleCount(TranslateTransition.INDEFINITE);
        fadeTransition.setInterpolator(Interpolator.LINEAR);
        fadeTransition.setFromValue(1);//fade in from 0 to 1
        fadeTransition.setToValue(0);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        //scale :- scales the object
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(stickMan);
        scaleTransition.setDuration(Duration.seconds(1));
        scaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
        scaleTransition.setInterpolator(Interpolator.LINEAR);
        scaleTransition.setByX(-0.55);//decrease in X by 0.55
        scaleTransition.setByY(0.45);//increase in Y by 0.45
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();

    }

}