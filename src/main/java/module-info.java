module com.example.assignment3zoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    opens com.example.assignment3zoo to javafx.fxml;
    exports com.example.assignment3zoo;
    exports com.example.assignment3zoo.Controllers;
    opens com.example.assignment3zoo.Controllers to javafx.fxml;
    exports com.example.assignment3zoo.Model;
    opens com.example.assignment3zoo.Model to javafx.fxml;
}