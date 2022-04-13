module com.example.eventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventhandling to javafx.fxml;
    exports com.example.eventhandling;
}