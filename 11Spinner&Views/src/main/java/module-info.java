module com.example.spinnerviews {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spinnerviews to javafx.fxml;
    exports com.example.spinnerviews;
}