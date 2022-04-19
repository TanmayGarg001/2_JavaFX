module com.example.datepickercolorpickercoicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datepickercolorpickercoicebox to javafx.fxml;
    exports com.example.datepickercolorpickercoicebox;
}