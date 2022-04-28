package com.example.menubarflowpane;

import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public MenuBar menuID;

    public void saved() {
        System.out.println("Saved!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Keyboard shortcut can be added using sceneBuilder using accelerator property
        Menu tempMenu = new Menu("Opt >");
        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");
        tempMenu.getItems().addAll(menuItem1, menuItem2, menuItem3);
        menuID.getMenus().add(tempMenu);

        //Sub-Menu
        Menu subMenu = new Menu("Menu Beta");
        MenuItem menuItem1s = new MenuItem("Option 1a");
        MenuItem menuItem2s = new MenuItem("Option 1b");
        MenuItem menuItem3s = new MenuItem("Option 1c");
        subMenu.getItems().addAll(menuItem1s, menuItem2s, menuItem3s);
        tempMenu.getItems().add(subMenu);

    }
}