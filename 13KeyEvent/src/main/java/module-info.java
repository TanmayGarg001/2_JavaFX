module com.example.keyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keyevent to javafx.fxml;
    exports com.example.keyevent;
}