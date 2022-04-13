package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle mainCircle;
    private double x;
    private double y;

    public void up() {
        System.out.println("UP");
        mainCircle.setCenterY(y -= 5);
    }

    public void down() {
        System.out.println("DOWN");
        mainCircle.setCenterY(y += 5);
    }

    public void left() {
        System.out.println("LEFT");
        mainCircle.setCenterX(x -= 5);
    }

    public void right() {
        System.out.println("RIGHT");
        mainCircle.setCenterX(x += 5);
    }

}