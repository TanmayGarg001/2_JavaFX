module com.example.menubarflowpanekeyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.menubarflowpane to javafx.fxml;
    exports com.example.menubarflowpane;
}