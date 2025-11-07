package ensisa.birds;

import java.io.IOException;

import ensisa.birds.model.Bird;
import ensisa.birds.model.BirdRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label latinNameLabel;

    @FXML
    private Label commonNameLabel;

    public Bird currentBird;

    private BirdRepository repository;

    public MainController() {
        repository = new BirdRepository();
        repository.load();
        currentBird = repository.birds.get(0);
    }

    public void initialize() {
        commonNameLabel.setText(currentBird.getCommonName());
        latinNameLabel.setText(currentBird.getLatinName());
    }

    @FXML
    private void switchToSecondary() throws IOException {
        BirdApplication.setRoot("secondary");
    }

}
