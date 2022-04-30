package com.example.mediaview;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

//to change dimensions of media view use fit width and height in sceneBuilder
public class HelloController implements Initializable {
    public MediaView mediaPlayer;
    public Button pauseBtn;
    public Button playBtn;
    public Button resetBtn;

    private MediaPlayer mediaP;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/main/resources/com/example/mediaview/familyGuy.mp4");
        Media media = new Media(file.toURI().toString());
        mediaP = new MediaPlayer(media);
        mediaPlayer.setMediaPlayer(mediaP);
    }

    public void pause() {
        mediaP.pause();
        System.out.println("Paused___");
    }

    public void play() {
        mediaP.play();
        System.out.println("Playing...");
    }

    public void reset() {
        mediaP.seek(Duration.millis(0));
        System.out.println("Reset!");
    }


}