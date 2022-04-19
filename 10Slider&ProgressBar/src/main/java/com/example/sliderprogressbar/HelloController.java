package com.example.sliderprogressbar;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Slider thermometer;
    public Label tempMessage;

    public ProgressBar progressPercentage;
    public Label progressLabel;
    public Button btnProg;
    BigDecimal i = BigDecimal.valueOf(0);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressPercentage.setStyle("-fx-accent: #1fb6a9;");
        thermometer.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                int temp = (int) thermometer.getValue();
                tempMessage.setText("Temperature is : " + temp + "°C ");
            }
        });
    }

    public void increaseProgress() {
        if (progressPercentage.getProgress() < 1) {//for double, it should be 1 but after 10 times instead of 100% ans is 99.99999999999% due to some loss of precision,
            //or we can use BigDecimal
            i = i.add(BigDecimal.valueOf(.1));
            progressPercentage.setProgress(i.doubleValue());
            progressLabel.setText("Progress : " + ((int) (i.doubleValue() * 100)) + "%");//no rounding is needed!
        } else {
            progressLabel.setText("100% achieved!");
        }
    }

}