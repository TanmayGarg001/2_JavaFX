package com.example.spinnerviews;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Spinner<Integer> spinnerItem;
    public Label countTrack;
    public int count;

    public ListView<String> listV;
    public Label labelLV;
    public String[] food = {"Pizza", "Burger", "Cheese", "Coke", "Mojito", "Ramen"};

    public TreeView<String> treeV;//this is epic
    public Label labelTV;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //We need to implement this in order to make logic for spinner ans it handles all aspects of a spinner.
        SpinnerValueFactory<Integer> spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        spinnerValueFactory.setValue(0);
        spinnerItem.setValueFactory(spinnerValueFactory);
        count = spinnerItem.getValue();
        countTrack.setText("Count : " + count);
        spinnerItem.valueProperty().addListener(new ChangeListener<>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                count = spinnerItem.getValue();
                countTrack.setText("Count : " + count);
            }
        });
        listV.getItems().addAll(food);
        listV.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String currentFood = listV.getSelectionModel().getSelectedItem();
                labelLV.setText("Item selected : " + currentFood);
            }
        });

        //We can pass icon in treeItem alongSide the file name for visual purposes.
        ImageView filesIcon = new ImageView(String.valueOf(getClass().getResource("icons/folderIcon.png")));
        ImageView gamesIcon = new ImageView(String.valueOf(getClass().getResource("icons/gamesIcon.png")));
        ImageView moviesIcon = new ImageView(String.valueOf(getClass().getResource("icons/moviesIcon.png")));
        ImageView softwareIcon = new ImageView(String.valueOf(getClass().getResource("icons/softwareIcon.png")));
        filesIcon.setFitHeight(16);
        filesIcon.setFitWidth(16);
        gamesIcon.setFitHeight(16);
        gamesIcon.setFitWidth(16);
        moviesIcon.setFitHeight(16);
        moviesIcon.setFitWidth(16);
        softwareIcon.setFitHeight(16);
        softwareIcon.setFitWidth(16);
        TreeItem<String> rootItem = new TreeItem<>("Files", filesIcon);
        TreeItem<String> games = new TreeItem<>("Games", gamesIcon);
        TreeItem<String> movies = new TreeItem<>("Movies", moviesIcon);
        TreeItem<String> software = new TreeItem<>("Software", softwareIcon);
        rootItem.getChildren().addAll(games, movies, software);//You can add TreeItem and using loop to remove duplication

        TreeItem<String> leafItemGame1 = new TreeItem<>("Counter Strike Global Offensive");
        TreeItem<String> leafItemGame2 = new TreeItem<>("The Witcher 3");
        TreeItem<String> leafItemGame3 = new TreeItem<>("GTA V");
        games.getChildren().addAll(leafItemGame1, leafItemGame2, leafItemGame3);

        TreeItem<String> leafItemMovie1 = new TreeItem<>("Interstellar");
        TreeItem<String> leafItemMovie2 = new TreeItem<>("Shutter Island");
        TreeItem<String> leafItemMovie3 = new TreeItem<>("Fight Club");
        movies.getChildren().addAll(leafItemMovie1, leafItemMovie2, leafItemMovie3);

        TreeItem<String> leafItemSoftware1 = new TreeItem<>("IntelliJ IDEA");
        TreeItem<String> leafItemSoftware2 = new TreeItem<>("MSI Afterburner");
        TreeItem<String> leafItemSoftware3 = new TreeItem<>("Hardware Info");
        TreeItem<String> leafItemSoftware4 = new TreeItem<>("ThrottleStop");
        TreeItem<String> leafItemSoftware5 = new TreeItem<>("Crystal Disk Info");
        software.getChildren().addAll(leafItemSoftware1, leafItemSoftware2, leafItemSoftware3, leafItemSoftware4, leafItemSoftware5);
        treeV.setRoot(rootItem);
    }

    public void selectItem() {
        TreeItem<String> itemSelected = treeV.getSelectionModel().getSelectedItem();//is this will throw null pointer exception if none item is selected or
        //if you select the triangle thingy.
        if (itemSelected != null) {
            labelTV.setText("Item selected:\n" + itemSelected.getValue());
        }
    }

}