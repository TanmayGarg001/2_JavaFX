package com.example.controllerslogoutexitbuttons;

import javafx.scene.text.Text;

public class Scene2Controller {

    public Text welcomeID;

    public void setWelcomeID(String username) {
        welcomeID.setText("Welcome, " + username + " !");
    }
}
