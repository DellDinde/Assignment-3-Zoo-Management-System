module com.example.assignment3zoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment3zoo to javafx.fxml;
    exports com.example.assignment3zoo;
    exports Model;
    opens Model to javafx.fxml;
    exports Controllers;
    opens Controllers to javafx.fxml;
}