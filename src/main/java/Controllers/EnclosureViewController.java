package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EnclosureViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onCloseButtonClick() {

    }
}
