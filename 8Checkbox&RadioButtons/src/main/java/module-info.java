module com.example.checkboxradiobuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkboxradiobuttons to javafx.fxml;
    exports com.example.checkboxradiobuttons;
}