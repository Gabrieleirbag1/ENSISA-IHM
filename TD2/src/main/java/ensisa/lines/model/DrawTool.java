package ensisa.lines.model;

import ensisa.lines.MainController;
import ensisa.lines.tools.Tool;

public class DrawTool implements Tool {
    public MainController mainController;

    public DrawTool(MainController controller) {
        this.mainController = controller;
    }
}
