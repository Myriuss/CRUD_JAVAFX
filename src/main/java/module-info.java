module com.example.playground2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.playground2 to javafx.fxml;
    exports com.example.playground2;
}