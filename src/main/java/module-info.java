module com.example.catalogue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.catalogue to javafx.fxml;
    exports com.example.catalogue;
}