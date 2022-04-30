module com.example.mediaview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.example.mediaview to javafx.fxml;
    exports com.example.mediaview;
}