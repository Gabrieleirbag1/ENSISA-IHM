module birds.ensisa {
    requires javafx.controls;
    requires javafx.fxml;

    opens birds.ensisa to javafx.fxml;
    exports birds.ensisa;
}
