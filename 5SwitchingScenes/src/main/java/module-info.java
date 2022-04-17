module com.example.switchingscenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switchingscenes to javafx.fxml;
    exports com.example.switchingscenes;
}