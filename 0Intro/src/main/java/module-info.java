module com.example.intro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intro to javafx.fxml;
    exports com.example.intro;
}