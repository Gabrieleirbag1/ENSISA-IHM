package ensisa.birds;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToMain() throws IOException {
        BirdApplication.setRoot("main");
    }
}