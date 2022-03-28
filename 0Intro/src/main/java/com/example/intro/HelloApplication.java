package com.example.intro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Stage is a top level container(think of it as window for our application) similar JFrame in Swing.
//Scene is added to a stage,it is a drawing surface for Graphical content at stage, similar to JPanel.
//Scene graph is heretical tree of nodes(hre nodes are different components that we add to a scene).
//Parent is the base class for all nodes that have children in the scene graph
//They are arranged in the form of tree :- root node,leaf node,branch node etc.We need at least root node to create a scene.
//And then we add the scene to stage.

public class HelloApplication extends Application {
    //Application class has one abstract method, so we need to override that here.
    public static void main(String[] args) {
        launch(args);//static method in Application class.
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();//group of nodes
        Scene scene = new Scene(root, Color.CORAL);//root node added to scene
        stage.setTitle("First JavaFX Program");
        stage.setX(10);//by default stage is in the middle of computer screen
        stage.setY(18);//Sets acc. to resolution in this case 1920*1080
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press esc to exit.");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
        stage.setScene(scene);//Scene set on stage
        stage.show();//display the scene
    }
}