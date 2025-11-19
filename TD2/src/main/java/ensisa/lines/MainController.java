package ensisa.lines;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void onHelloButtonClick() throws IOException {
        System.out.println("Hello World!");
    }

    @FXML
    private void quitMenuAction() {
        Platform.exit();
    }

}