package ensisa.lines;

import ensisa.lines.model.Document;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MainController {
    private final Document document = new Document();
    
    @FXML
    public Pane editorPane;

    @FXML
    private void quitMenuAction() {
        Platform.exit();
    }

    public Document getDocument() {
        return document;
    }
}