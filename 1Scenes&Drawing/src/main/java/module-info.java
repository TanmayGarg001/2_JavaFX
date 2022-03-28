module com.example.scenes_drawing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenes_drawing to javafx.fxml;
    exports com.example.scenes_drawing;
}