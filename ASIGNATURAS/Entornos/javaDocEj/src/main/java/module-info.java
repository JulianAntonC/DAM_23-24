module com.example.javadocej {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadocej to javafx.fxml;
    exports com.example.javadocej;
}