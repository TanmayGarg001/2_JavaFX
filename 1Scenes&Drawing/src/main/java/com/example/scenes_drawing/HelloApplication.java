package com.example.scenes_drawing;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1400, 900, Color.CORNFLOWERBLUE);
        stage.setResizable(false);

        Text text = new Text(60, 120, "Damn this is cool!");//we can do all this individually to using setText and SetX and SetY.
        text.setFont(Font.font("Consolas", 25));
        text.setFill(Color.LIGHTGREEN);
        root.getChildren().add(text);//added to group node

        Line line = new Line(100, 50, 500, 50);//can be done with setStartX&Y and endStartX&Y
        line.setStroke(Color.HOTPINK);
        line.setOpacity(0.90);
        line.setStrokeWidth(5);
        line.setRotate(10);
        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(250);
        rectangle.setY(250);
        rectangle.setWidth(100);
        rectangle.setHeight(70);
        rectangle.setFill(Color.DARKBLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(500.0, 500.0,//X ands Y points are set accordingly remember that origin is at top left.If polygon is not possible nothing will be drawn.
                600.0, 600.0,
                700.0, 500.0);
        triangle.setFill(Color.SLATEGRAY);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(700);
        circle.setCenterY(700);
        circle.setRadius(50);
        circle.setFill(Color.SALMON);
        root.getChildren().add(circle);

        ImageView imageView = new ImageView(new Image(String.valueOf(getClass().getResource("images/img.png"))));
        imageView.setX(750);
        imageView.setY(500);
        root.getChildren().add(imageView);

        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/img_1.png"))));
        stage.setTitle("Scenes and drawing");
        stage.setScene(scene);
        stage.show();
        //now in order to make layouts like we do in android studio we can code all that by ourselves, but in order to optimize that
        //there is a tool called scene builder which speeds up this process.So, we will learn that now.
    }
}