package ensisa.lines;

import ensisa.lines.model.Document;
import ensisa.lines.model.LinesEditor;
import ensisa.lines.model.StraightLine;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MainController {
    private final Document document;
    private LinesEditor linesEditor;
    @FXML
    public Pane editorPane;

    public MainController() {
        document = new Document();
    }

    public void initialize() {
        linesEditor = new LinesEditor(editorPane);
        observeDocument();
        StraightLine l = new StraightLine();
        l.setStartX(10);
        l.setStartY(20);
        l.setEndX(300);
        l.setEndY(60);
        document.getLines().add(l);
    }

    private void observeDocument() {
        document.getLines().addListener(new ListChangeListener<StraightLine>() {
            public void onChanged(ListChangeListener.Change<? extends StraightLine> c) {
                while (c.next()) {
                    // Des lignes ont été supprimées du modèle
                    for (StraightLine line : c.getRemoved()) {
                        linesEditor.removeLine(line);
                    }
                    // Des lignes ont été ajoutées au modèle
                    for (StraightLine line : c.getAddedSubList()) {
                        linesEditor.createLine(line);
                    }
                }
            }
        });
    }

    public LinesEditor getLinesEditor() {
        return linesEditor;
    }
}