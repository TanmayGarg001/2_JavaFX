module com.example.imageviewtextfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imageviewtextfield to javafx.fxml;
    exports com.example.imageviewtextfield;
}