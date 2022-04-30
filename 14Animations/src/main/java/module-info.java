module com.example.animations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animations to javafx.fxml;
    exports com.example.animations;
}