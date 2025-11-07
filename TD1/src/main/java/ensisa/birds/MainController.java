package ensisa.birds;

import java.io.IOException;

import ensisa.birds.model.BirdRepository;
import javafx.fxml.FXML;

public class MainController {

    private BirdRepository repository;

    public MainController() {
        repository = new BirdRepository();
        repository.load();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        BirdApplication.setRoot("secondary");
    }
}
