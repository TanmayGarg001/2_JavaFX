module com.example.controllerslogoutexitbuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controllerslogoutexitbuttons to javafx.fxml;
    exports com.example.controllerslogoutexitbuttons;
}