module com.example.sliderprogressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sliderprogressbar to javafx.fxml;
    exports com.example.sliderprogressbar;
}